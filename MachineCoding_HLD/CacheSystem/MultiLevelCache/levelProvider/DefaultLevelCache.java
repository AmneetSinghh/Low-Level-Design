package MachineCoding_HLD.CacheSystem.MultiLevelCache.levelProvider;

import MachineCoding_HLD.CacheSystem.Cache.Cache;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.LevelCacheData;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.ReadResponse;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.WriteResponse;
import lombok.*;

import java.util.Collections;
import java.util.List;

//CacheService -> L1 -> L2 -> L3...Ln -> null
//                C1    C2

// Chain of responsibility     Each level is independent, we have used different cache here.
// used recursion for adding or removing into the cache.

@AllArgsConstructor
public class DefaultLevelCache<Key, Value> implements ILevelCache<Key, Value> {
    private final LevelCacheData levelCacheData;// set using constructor
    private final Cache<Key, Value> cacheProvider;// set using constructor

    @NonNull
    private final ILevelCache<Key, Value> next;// set using constructor

    @NonNull
    public WriteResponse set(Key key, Value value) {
        Double curTime = 0.0;
        Value curLevelValue = cacheProvider.get(key);
        curTime += levelCacheData.getReadTime();
        if (!value.equals(curLevelValue)) {
            cacheProvider.put(key, value);
            curTime += levelCacheData.getWriteTime();
        }

        curTime += next.set(key, value).getTimeTaken();
        return new WriteResponse(curTime);
    }

    /*
     * Recursion.
     */
    @NonNull
    public ReadResponse<Value> get(Key key) {
        Double curTime = 0.0;
        Value curLevelValue = cacheProvider.get(key);
        curTime += levelCacheData.getReadTime();

        // L1 -> L2 -> L3 -> L4 -> NULL.
        if (curLevelValue == null) {
            ReadResponse<Value> nextResponse = next.get(key);
            curTime += nextResponse.getTotalTime();
            curLevelValue = nextResponse.getValue();
            if (curLevelValue != null) {// by recursion we get this.
                cacheProvider.put(key, curLevelValue);
                curTime += levelCacheData.getWriteTime();
            }
        }

        return new ReadResponse<>(curLevelValue, curTime);
    }

    @NonNull
    public List<Double> getUsages() {
        final List<Double> usages;
        if (next == null) {
            usages = Collections.emptyList();
        } else {
            usages = next.getUsages();
        }

        usages.add(0, cacheProvider.getCurrentUsage());// add into the front, capacity of each level.
        return usages;
    }
}