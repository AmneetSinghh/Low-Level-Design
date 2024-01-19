package LLD.Interview_Questions.flipkart.EventBiddingSystem.model;

public class EventAnalytics {
    public EventAnalytics(int registeredMemberCount) {
        this.registeredMemberCount = registeredMemberCount;
    }

    private int registeredMemberCount;

    public int getRegisteredMemberCount() {
        return registeredMemberCount;
    }

    public void setRegisteredMemberCount(int registeredMemberCount) {
        this.registeredMemberCount = registeredMemberCount;
    }
}
