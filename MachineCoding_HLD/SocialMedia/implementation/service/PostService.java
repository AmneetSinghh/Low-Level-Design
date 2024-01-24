package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.post.Comment;
import MachineCoding_HLD.SocialMedia.implementation.model.post.Post;
import MachineCoding_HLD.SocialMedia.implementation.model.profile.Member;

/*
implementation :

List<Post> posts; contain all posts.

when post is created, it is added to feed of each of its connections & followers.
Condition : If membera follows memberb then only he will see posts, with respect of connection accepted or not.
 */
public interface PostService {

    void addPost(Member member);
    void editPost(Member member);
    void deletePost(Member member);

    void likePost(Member member, Post post);
    void dislikePost(Member member, Post post);

    void addComment(Member member, Post post);
    void deleteComment(Member member, Post post, Comment comment);

    void likeComment(Member member, Post post, Comment comment);
    void dislikeComment(Member member, Post post, Comment comment);

    void commentReply(Member member, Post post, Comment comment);
    void likeReply(Member member, Post post, Comment comment);
    void dislikeReply(Member member, Post post, Comment comment);
    void deleteCommentReply(Member member, Post post, Comment comment);

    /*
     All get methods.
     */


}
