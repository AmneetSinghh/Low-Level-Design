package MachineCoding_HLD.CacheSystem.MultiLevelCache.levelProvider;

import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.ReadResponse;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.WriteResponse;

import java.util.Collections;
import java.util.List;

/*
 * Last level, as the terminal level of the L1-> L2-> L3-> NullEffectLevelCache
 * DefaultLevelCache (L1)-> DefaultLevelCache (L2) -> DefaultLevelCache (L3) -> NullEffectLevelCache
 */



public class NullEffectLevelCache<Key, Value> implements ILevelCache<Key, Value> {
    @Override
    public WriteResponse set(Key key, Value value) {
        return new WriteResponse(0.0);
    }

    @Override
    public ReadResponse<Value> get(Key key) {
        return new ReadResponse<>(null, 0.0);
    }

    @Override
    public List<Double> getUsages() {
        return Collections.emptyList();
    }
}
