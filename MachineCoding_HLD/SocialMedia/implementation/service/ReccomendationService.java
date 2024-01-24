package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;
/*
 *
 */
public interface ReccomendationService {
    void give(Member sender, Member receiver);
    void request(Member sender, Member receiver);
}
