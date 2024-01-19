package LLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.EventMember;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.service.IBidService;
import java.util.ArrayList;
import java.util.List;


public class BidService implements IBidService {

    List<Bid> bids = new ArrayList<>();

    @Override
    public void submit(Bid bid) {
        EventMember member = bid.getMember();
        if(member.getBidCountLeft() > 0){
            member.setBidCountLeft(member.getBidCountLeft()-1);
            bids.add(bid);
            System.out.println("Bid submitted: Details:: "+ member.getMember().getName()+" Left: "+ member.getBidCountLeft() + " Amount : "+ bid.getAmount());
        } else{
            System.out.println("Not able to submit bid");
        }
    }

    public List<Bid> get(){
        return bids;
    }
}
