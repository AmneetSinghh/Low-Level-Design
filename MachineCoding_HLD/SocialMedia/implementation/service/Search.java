package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

public interface Search {
    Member SearchMember(String name);
    Member SearchCompany(String name);
    Member SearchJob(String name);
}

// index all.

/* Map<name,Member> searchByMemberIndex. */