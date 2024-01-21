package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;

import java.util.List;

public interface IBidService {
    void submit(Bid bid);
    List<Bid> get();
}
