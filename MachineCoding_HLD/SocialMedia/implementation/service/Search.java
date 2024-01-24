package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

public interface Search {
    Member SearchMember(String name);// when search happens increase searchAppearaces of profile stat;
    Member SearchCompany(String name);// when search happens increase searchAppearaces of profile stat;
    Member SearchJob(String name);// when search happens increase searchAppearaces of profile stat;
}


/* Map<name,Member> searchByMemberIndex. */
/* Map<name,Company> searchByMemberIndex. */
/* Map<name,Job> searchByMemberIndex. */