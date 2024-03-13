package MachineCoding_HLD.CacheSystem.MultiLevelCache.service;


import MachineCoding_HLD.CacheSystem.MultiLevelCache.levelProvider.DefaultLevelCache;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.levelProvider.ILevelCache;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.ReadResponse;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.StatsResponse;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.WriteResponse;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class CacheService<Key, Value> {

    private final ILevelCache<Key, Value> multiLevelCache;// Chain of responsibility.  -> it has the L1 Level.
    private final List<Double> lastReadTimes;
    private final List<Double> lastWriteTimes;
    private final int lastCount;

    public CacheService(@NonNull final DefaultLevelCache<Key, Value> multiLevelCache, final int lastCount) {
        this.multiLevelCache = multiLevelCache;
        this.lastCount = lastCount;
        this.lastReadTimes = new ArrayList<>(lastCount);
        this.lastWriteTimes = new ArrayList<>(lastCount);
    }

    public WriteResponse set(@NonNull final Key key, @NonNull final Value value) {
        final WriteResponse writeResponse = multiLevelCache.set(key, value);
        addTimes(lastWriteTimes, writeResponse.getTimeTaken());
        return writeResponse;
    }

    public ReadResponse<Value> get(@NonNull final Key key) {
        final ReadResponse<Value> readResponse = multiLevelCache.get(key);
        addTimes(lastReadTimes, readResponse.getTotalTime());
        return readResponse;
    }

    public StatsResponse stats() {
        return new StatsResponse(getAvgReadTime(), getAvgWriteTime(), multiLevelCache.getUsages());
    }

    private Double getAvgReadTime() {
        return getSum(lastReadTimes)/lastReadTimes.size();
    }

    private Double getAvgWriteTime() {
        return getSum(lastWriteTimes)/lastWriteTimes.size();
    }

    private void addTimes(List<Double> times, Double time) {
        if (times.size() == this.lastCount) {
            times.remove(0);
        }

        times.add(time);
    }

    private Double getSum(List<Double> times) {
        Double sum = 0.0;
        for (Double time: lastReadTimes) {
            sum += time;
        }
        return sum;
    }
}