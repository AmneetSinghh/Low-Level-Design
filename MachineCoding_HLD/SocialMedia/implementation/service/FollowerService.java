package MachineCoding_HLD.SocialMedia.implementation.service;
import MachineCoding_HLD.SocialMedia.implementation.model.CompanyPage;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

/*
 * Member can follow a member & companyPage.
 * Map<Member,
 */

public interface FollowerService {
    void follow(Member followBy, Member followTo); // If we don't follow someone then we can't see his/her posts.
    void unfollow(Member followBy, Member followTo);
    void follow(Member followBy, CompanyPage company);
    void unfollow(Member followBy, CompanyPage company);
    void follow(CompanyPage followBy, CompanyPage followTo);
}
