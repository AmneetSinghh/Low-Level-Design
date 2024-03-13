package MachineCoding_HLD.CacheSystem.MultiLevelCache.model;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
public class StatsResponse {

    private final Double avgReadTime;
    private final Double avgWriteTime;
    private final List<Double> usages;//Size of each level cache.
}