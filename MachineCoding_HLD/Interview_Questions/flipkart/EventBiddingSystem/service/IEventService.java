package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service;

import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Event;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.EventMember;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Member;

public interface IEventService {
    void addEvent(int id);
    void registerMember(Member member, Event event);  // hashmap<event,list<members>>
    void submitBid(Event event, Bid bid);
    void declareWinner(Event event);
    Event getEvent();
    EventMember getEventMember(Event event, Member member);
}
