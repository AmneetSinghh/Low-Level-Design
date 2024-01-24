package MachineCoding_HLD.SocialMedia.implementation.model.post;

import MachineCoding_HLD.SocialMedia.implementation.model.Media;

import java.util.List;

public class Comment extends BasePostAction{
    String description;
    List<Like> likeList;
    List<Media> media;
    List<Comment> replies;
}
