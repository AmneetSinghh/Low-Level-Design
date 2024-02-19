package MachineCoding_HLD.MockInterview.unicards.controller.models;

import MachineCoding_HLD.MockInterview.unicards.controller.enums.MessagingType;
import MachineCoding_HLD.MockInterview.unicards.controller.enums.PageTag;
import MachineCoding_HLD.MockInterview.unicards.controller.enums.TouchpointType;

public class TouchpointModel {
    private PageTag pageTag;

    public PageTag getPageTag() {
        return pageTag;
    }

    public void setPageTag(PageTag pageTag) {
        this.pageTag = pageTag;
    }

    public TouchpointType getType() {
        return type;
    }

    public void setType(TouchpointType type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MessagingType getMessagingType() {
        return messagingType;
    }

    public void setMessagingType(MessagingType messagingType) {
        this.messagingType = messagingType;
    }

    private TouchpointType type;
    private String data; // string in json format.
    private MessagingType messagingType;
}
