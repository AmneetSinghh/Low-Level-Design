package MachineCoding_HLD.SocialMedia.implementation.model;

import MachineCoding_HLD.SocialMedia.implementation.model.post.Post;

import java.util.List;

public class Feed {
    private int id;
    private List<Post> post;/// LRU cache
    private String sortedBy;// ascending or descending.
    private long createdAt;
}
