package MachineCoding_HLD.CacheSystem.MultiLevelCache.model;


import lombok.*;


@Getter
@AllArgsConstructor
public class LevelCacheData {
    int readTime;
    int writeTime;
}
