package LLD.Interview_Questions.flipkart.EventBiddingSystem.service;

import LLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl.EventManager;

public interface IWinnerStrategy {
    void chooseWinner(EventManager manager);
}
