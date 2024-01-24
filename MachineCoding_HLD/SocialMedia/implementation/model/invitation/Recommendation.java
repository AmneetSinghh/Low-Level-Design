package MachineCoding_HLD.SocialMedia.implementation.model.invitation;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

public class Recommendation {
    private int id;
    private Member receivedBy;
    private Member gaveBy;
    // type;
    private String description;
    private long createdAt;
}


// member1 - member2
// member2 -> member1
// member3 - member2
// member3 - member1