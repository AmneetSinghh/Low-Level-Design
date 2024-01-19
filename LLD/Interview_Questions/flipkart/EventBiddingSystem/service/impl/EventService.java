package LLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl;

import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.*;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.service.IEventService;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.service.IWinnerStrategy;
import java.util.*;



public class EventService implements IEventService {

    Map<Event,EventManager> eventList = new HashMap<>(); // index to name.
    IWinnerStrategy iWinnerStrategy;

    public EventService(IWinnerStrategy winnerStrategy){
        this.iWinnerStrategy = winnerStrategy;
    }


    @Override
    public void addEvent(int id) {
        Event event = new Event(UUID.randomUUID(),"EventName_"+id,3,new EventAnalytics(0));
        eventList.put(event,new EventManager(new BidService()));
    }

    @Override
    public void registerMember(Member member, Event event) {
        EventMember eventMember = new EventMember(member,member.getId(),event.getMaxBidCount());
        eventList.get(event).registerMember(eventMember);
    }

    @Override
    public void submitBid(Event event, Bid bid) {
        eventList.get(event).submitBid(bid);
    }

    @Override
    public void declareWinner(Event event) {
        iWinnerStrategy.chooseWinner(eventList.get(event));
    }

    public Event getEvent(){
        return eventList.keySet().iterator().next();
    }

    public EventMember getEventMember(Event event, Member member){
        return eventList.get(event).getMember(member);
    }
}
