package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.controller;

import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Event;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.EventMember;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Member;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.IEventService;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.IMemberService;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.IWinnerStrategy;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl.EventService;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl.LowBidWinnerStrategy;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl.MemberService;

import java.util.List;
import java.util.Random;

public class EventBiddingRunner {
    public static void main(String[] args){
        IMemberService memberService = new MemberService();
        IWinnerStrategy winnerStrategy = new LowBidWinnerStrategy();
        IEventService eventService = new EventService(winnerStrategy);
        for(int i=1;i<=5;i++){
            memberService.add(i);
            eventService.addEvent(i);
        }
        Event event = eventService.getEvent();
        List<Member> memberList = memberService.getAll();
        for(int i=1;i<=5;i++){
            eventService.registerMember(memberList.get(i-1),event);
        }

        for(int i=0;i<=50;i++){
            Member member = memberList.get(i%5);
            EventMember eventMember = eventService.getEventMember(event,member);
            long createdAt = System.currentTimeMillis();
            Random random = new Random();
            int randomAmount = random.nextInt(1000) + 1;
            Bid bid = new Bid(randomAmount,member.getId(),eventMember,createdAt);
            eventService.submitBid(event,bid);
        }

        eventService.declareWinner(event);


    }
}
