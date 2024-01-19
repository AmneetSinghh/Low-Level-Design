package LLD.Interview_Questions.flipkart.EventBiddingSystem.service;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;

import java.util.List;

public interface IBidService {
    void submit(Bid bid);
    List<Bid> get();
}
