package MachineCoding_HLD.SocialMedia.implementation.service;

/*
 * X added post, get added to feed to all its connections
 * List<Member, List<Posts>> feed;
 */

import MachineCoding_HLD.SocialMedia.implementation.model.post.Post;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

import java.util.List;

public interface FeedService {
    void add(Member member, Post post);// find the connections for X member, and add the posts
    void delete(Member member, Post post);// find the connections for X member, and add the posts
    List<Post> showFeed(Member member);
}
