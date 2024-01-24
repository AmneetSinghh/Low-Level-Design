package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

public interface MemberService {
    void addMember();
    void deleteMember(Member member);
    Member getMemberById(int id);
}
