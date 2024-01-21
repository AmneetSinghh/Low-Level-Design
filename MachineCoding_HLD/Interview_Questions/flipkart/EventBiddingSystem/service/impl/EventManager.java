package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl;

import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.EventMember;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Member;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.IBidService;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.IEventManager;

import java.util.ArrayList;
import java.util.List;

/*
For every event we have Event manager.
*/

public class EventManager implements IEventManager {

    List<EventMember> eventMemberList;
    IBidService bidService;

    public EventManager(IBidService bidService){
        this.eventMemberList = new ArrayList<>();
        this.bidService = bidService;
    }

    @Override
    public void registerMember(EventMember member){
        eventMemberList.add(member);
    }
    @Override
    public void submitBid(Bid bid){
        bidService.submit(bid);
    }

    @Override
    public List<Bid> getBids() {
        return bidService.get();
    }

    public EventMember getMember(Member member){
        for(EventMember member1 : eventMemberList){
            if(member.getId() == member1.getId()){
                return member1;
            }
        }
        return null;
    }
}
