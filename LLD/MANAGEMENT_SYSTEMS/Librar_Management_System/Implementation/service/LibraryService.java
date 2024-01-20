package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.service;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.BookRepository;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.MemberRepository;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.Member;

public class LibraryService {
    MemberRepository memberRepository;

    public LibraryService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public void addMember(int id){
        Member member = new Member();
        member.init(id);
        memberRepository.addMember(member);
    }

    public Member getMemberById(int id){
        return memberRepository.getMemberById(id);
    }
}
