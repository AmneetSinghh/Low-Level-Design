package MachineCoding_HLD.CacheSystem.MultiLevelCache.levelProvider;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.ReadResponse;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.model.WriteResponse;
import lombok.*;

import java.util.List;

public interface ILevelCache<Key, Value> {

    @NonNull
    WriteResponse set(Key key, Value value);

    @NonNull
    ReadResponse<Value> get(Key key);

    @NonNull
    List<Double> getUsages();
}