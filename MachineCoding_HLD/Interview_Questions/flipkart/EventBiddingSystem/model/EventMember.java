package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model;

import java.util.UUID;

public class EventMember {
    private Member member;
    private UUID id;
    private int bidCountLeft;

    public EventMember(Member member, UUID id, int bidCountLeft) {
        this.member = member;
        this.id = id;
        this.bidCountLeft = bidCountLeft;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }



    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getBidCountLeft() {
        return bidCountLeft;
    }

    public void setBidCountLeft(int bidCountLeft) {
        this.bidCountLeft = bidCountLeft;
    }

}
