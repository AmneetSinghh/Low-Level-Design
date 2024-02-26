package MachineCoding_HLD.SocialMedia.implementation.model.profile;

public class Member {
    private int id;
    private String name;
    private String email;
    private String password;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;
}

/*
- Profile wil have member forein key./
-  Member will not have profile as profile can be off diffeent types.



 Profile recruiter, profile job Seeker.
 */