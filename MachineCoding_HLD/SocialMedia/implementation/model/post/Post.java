package MachineCoding_HLD.SocialMedia.implementation.model.post;

import MachineCoding_HLD.SocialMedia.implementation.model.Media;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

import java.util.List;

public class Post {
    private int id;
    private Member createdBy;
    private List<Media> mediaList;
    private String description;
    private List<Like> likeList;
    private List<Comment> commentList;
    private List<Share> shareList;
    private long createdAt;
}
