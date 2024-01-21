package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.impl;

import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model.Member;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.service.IMemberService;
import MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.util.BaseUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* Service class should be singleton */
public class MemberService implements IMemberService {
    List<Member> members = new ArrayList<>();


    @Override
    public void add(int id) {
        Member member = new Member();
        member.setId(UUID.randomUUID());
        member.setName("AmneetSingh_"+id);
        member.setSuperCoins(BaseUtils.generateSuperCoins());
        members.add(member);
    }

    public List<Member> getAll(){
        return members;
    }

}
