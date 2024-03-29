package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Profile;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.ProfileStats;

public interface ProfileService {
    void addBasicProfile();
    void editBasicProfile();
    void delete(int profileId);
    void addEducation(int profileId);
    void addAccomplishments(int profileId);
    void addExperience(int profileId);
    void addSkills(int profileId);
    Profile getById(int profileId);
    ProfileStats getProfileStat(Member member);
}