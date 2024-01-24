package MachineCoding_HLD.SocialMedia.implementation.model.profile.experience;

import MachineCoding_HLD.SocialMedia.implementation.enums.PositionType;
import MachineCoding_HLD.SocialMedia.implementation.model.Company;

public class Position extends Experience{
    private String title;
    private PositionType type;
    private Company company;
    private long createdAt;
}
