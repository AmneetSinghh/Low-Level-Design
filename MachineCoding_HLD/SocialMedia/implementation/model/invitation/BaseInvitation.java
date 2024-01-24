package MachineCoding_HLD.SocialMedia.implementation.model.invitation;

import MachineCoding_HLD.SocialMedia.implementation.enums.InvitationStatus;
import MachineCoding_HLD.SocialMedia.implementation.enums.InvitationType;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

public class BaseInvitation {
    private int id;
    private Member sender;
    private Member recipient;
    private InvitationType type;
    private InvitationStatus status;
    private long createdAt;
}
