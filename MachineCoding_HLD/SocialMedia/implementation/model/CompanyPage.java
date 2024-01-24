package MachineCoding_HLD.SocialMedia.implementation.model;

import MachineCoding_HLD.SocialMedia.implementation.model.post.Post;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

import java.util.List;

public class CompanyPage {
    private int id;
    private Company company;// page for company.
    private List<Job> jobPostings;
    private List<Member> memberList;
    private List<Post> postList;
    private List<Follower> followerList;
}

/*
 *
 */