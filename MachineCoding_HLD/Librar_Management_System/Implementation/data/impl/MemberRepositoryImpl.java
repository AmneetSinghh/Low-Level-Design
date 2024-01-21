package MachineCoding_HLD.Librar_Management_System.Implementation.data.impl;

import MachineCoding_HLD.Librar_Management_System.Implementation.data.MemberRepository;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {
    // members
    List<Member> memberList = new ArrayList<>();

    @Override
    public void addMember(Member member) {
        memberList.add(member);
    }

    @Override
    public Member getMemberById(int id) {
        for(Member member : memberList){
            if(member.getId() == id){
                return member;
            }
        }
        return null;
    }
}
