package company_test.Scapia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Data
public class TrackDelivery {
    private Tracking tracking;
    private List<String> trackingStatuses;
}
