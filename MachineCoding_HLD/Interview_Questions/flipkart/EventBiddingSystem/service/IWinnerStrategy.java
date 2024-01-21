package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service;

import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl.EventManager;

public interface IWinnerStrategy {
    void chooseWinner(EventManager manager);
}
