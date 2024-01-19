package LLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl;

import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.Bid;
import LLD.Interview_Questions.flipkart.EventBiddingSystem.service.IWinnerStrategy;
import java.util.Comparator;
import java.util.List;

public class LowBidWinnerStrategy implements IWinnerStrategy {
    @Override
    public void chooseWinner(EventManager manager) {
        List<Bid> bids = manager.getBids();
        bids.sort(new MyComparator());
        System.out.println("Winner is-> ID: "+ bids.get(0).getMember().getId());
        System.out.println("NAME: "+ bids.get(0).getMember().getMember().getName());
        System.out.println("BID: bidAmount-> "+ bids.get(0).getAmount()+ " CreatedAt : "+ bids.get(0).getCreatedAt());
    }

    static class MyComparator implements Comparator<Bid>{

        /*
        -1 : first > second
        1 : first< second
        0 : first == second
         */
        @Override
        public int compare(Bid o1, Bid o2) {
            int amountCompare = Integer.compare(o1.getAmount(),o2.getAmount());
            if(amountCompare!=0){
                return amountCompare;
            }
            else{
                return Long.compare(o1.getCreatedAt(),o2.getCreatedAt());
            }
        }
    }
}
