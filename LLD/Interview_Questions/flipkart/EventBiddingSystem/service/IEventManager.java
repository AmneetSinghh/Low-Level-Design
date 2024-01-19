package LLD.Interview_Questions.flipkart.EventBiddingSystem.service;

import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.EventMember;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.Member;

import java.util.List;

public interface IEventManager {
    void registerMember(EventMember member);
    void submitBid(Bid bid);
    List<Bid> getBids();
    EventMember getMember(Member member);
}
