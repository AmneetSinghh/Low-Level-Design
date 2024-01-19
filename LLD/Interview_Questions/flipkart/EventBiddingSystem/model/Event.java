package LLD.Interview_Questions.flipkart.EventBiddingSystem.model;

import java.util.UUID;

public class Event {
    private UUID id;
    private String name;
    private int maxBidCount;
    private EventAnalytics eventAnalytics;

    public Event(UUID id, String name, int maxBidCount, EventAnalytics eventAnalytics) {
        this.id = id;
        this.name = name;
        this.maxBidCount = maxBidCount;
        this.eventAnalytics = eventAnalytics;
    }

    public EventAnalytics getEventAnalytics() {
        return eventAnalytics;
    }

    public void setEventAnalytics(EventAnalytics eventAnalytics) {
        this.eventAnalytics = eventAnalytics;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxBidCount() {
        return maxBidCount;
    }

    public void setMaxBidCount(int maxBidCount) {
        this.maxBidCount = maxBidCount;
    }



}

