package MachineCoding_HLD.Interview_Questions.flipkart.EventBiddingSystem.model;

import java.util.UUID;

public class Bid {
    private int amount;

    private UUID id;

    private EventMember eventMember; // memberId;
    private long createdAt;

    public Bid(int amount, UUID id, EventMember eventMember, long createdAt) {
        this.amount = amount;
        this.id = id;
        this.eventMember = eventMember;
        this.createdAt = createdAt;
    }

    public EventMember getMember() {
        return eventMember;
    }

    public void setMember(EventMember member) {
        this.eventMember = member;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
