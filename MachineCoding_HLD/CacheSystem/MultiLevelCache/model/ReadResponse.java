package MachineCoding_HLD.CacheSystem.MultiLevelCache.model;


import lombok.*;

@ToString
@AllArgsConstructor
@Getter
public class ReadResponse<Value> {
    Value value;
    Double totalTime;
}