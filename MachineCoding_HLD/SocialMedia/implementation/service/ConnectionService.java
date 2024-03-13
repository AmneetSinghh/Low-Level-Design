package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.invitation.Connection;
import MachineCoding_HLD.SocialMedia.implementation.model.invitation.ConnectionInvitation;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

import java.util.List;


/*
 * List< Member, List<ConnectionInvitation>> connectionInvitations;
 * List<Connections>
 */

public interface ConnectionService {
    void send(Member sender, Member recipient);
    void accept(Member acceptBy, Member sendBy);// added to connection.
    void reject(Member rejectedBy, Member sendBy);
    List<ConnectionInvitation> getPendingConnection(Member member);
    List<Connection> getConnectionsByMember(Member member);
}

/*
When invitation accepted:

-> both are added to connections                lets make a graph.
member[1].push(member2)
member[2].push(member1);
 */
