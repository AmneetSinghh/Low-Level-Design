package LLD.Interview_Questions.flipkart.EventBiddingSystem.service;

import LLD.Interview_Questions.flipkart.EventBiddingSystem.model.Member;

import java.util.List;

public interface IMemberService {
    void add(int id);
    List<Member> getAll();
}
