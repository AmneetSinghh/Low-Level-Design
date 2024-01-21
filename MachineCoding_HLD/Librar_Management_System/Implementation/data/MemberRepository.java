package MachineCoding_HLD.Librar_Management_System.Implementation.data;

import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;

public interface MemberRepository {
    void addMember(Member member);
    Member getMemberById(int id);
}
