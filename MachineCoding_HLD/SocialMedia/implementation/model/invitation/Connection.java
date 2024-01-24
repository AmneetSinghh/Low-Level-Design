package MachineCoding_HLD.SocialMedia.implementation.model.invitation;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

/*
 * Graph. member1-> member2-> member3-> member1
 */

public class Connection {
    private int id;
    private Member friend1;
    private Member friend2;
    private long createdAt;
}

/*
member1 friend of member2 means:
member1.push(member2)
member2.push(member1)
 */