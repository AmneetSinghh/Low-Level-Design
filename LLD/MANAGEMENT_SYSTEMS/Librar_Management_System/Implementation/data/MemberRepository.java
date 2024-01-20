package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.Member;

public interface MemberRepository {
    void addMember(Member member);
    Member getMemberById(int id);
}
