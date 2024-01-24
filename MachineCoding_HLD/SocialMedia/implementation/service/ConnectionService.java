package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.enums.ConnectionStatus;
import MachineCoding_HLD.SocialMedia.implementation.model.connection.ConnectionInvitation;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

import java.util.List;


/*
 * List< Member, List<ConnectionInvitation>> connectionInvitations;
 */

public interface ConnectionService {
    void send(Member sender, Member recipient);
    void accept(Member acceptBy, Member sendBy);
    void reject(Member rejectedBy, Member sendBy);
    List<ConnectionInvitation> getPendingConnection(Member member);
}
