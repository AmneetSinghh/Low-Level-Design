package MachineCoding_HLD.SocialMedia.implementation.model.profile;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.experience.Experience;

import java.util.List;

public class Profile{
    private int id;
    private Member member;// these basic details we can get from member.
    private String profileDp;
    private String backGroundDp;
    private String headline;
    private String headlineTags;
    private String about;
    private List<Accomplishment> accomplishmentList;
    private List<Education> educationList;
    private List<Skill> skillList;
    private List<Experience> experienceList;
    private long createdAt;
}



/*
 * There can be child classes that extend prlfile
 */