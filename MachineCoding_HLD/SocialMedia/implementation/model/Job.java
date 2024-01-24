package MachineCoding_HLD.SocialMedia.implementation.model;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

public class Job {
    private int id;
    private String title;
    private String jobRole;// enum;
    private String jobIndustry ; // can be enum
    private Company company;
    private Member postedBy;
    private long postedAt;
    private long createdAt;
}
