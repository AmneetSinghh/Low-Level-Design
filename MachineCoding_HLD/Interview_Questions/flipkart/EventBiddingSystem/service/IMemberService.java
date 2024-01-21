package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service;

import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Member;

import java.util.List;

public interface IMemberService {
    void add(int id);
    List<Member> getAll();
}
