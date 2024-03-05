package MachineCoding_HLD.MockInterview.unicards.controller.service;
import MachineCoding_HLD.MockInterview.unicards.controller.enums.MessagingType;

import java.util.HashMap;
import java.util.Map;

// registory pattern.

public class MessageRegistory {

    Map<MessagingType, MessageService> messageServiceRegistory = new HashMap<>();
    public MessageService getMessageServiceType(MessagingType type) throws Exception {
        if(messageServiceRegistory.containsKey(type)){
            return messageServiceRegistory.get(type);
        }
        else{
            register(type);
            return messageServiceRegistory.get(type);
        }
    }

    private void register(MessagingType type){
        switch (type){
            case EMAIL : messageServiceRegistory.put(type,new EmailServcie());
            case WHATSAPP : messageServiceRegistory.put(type,new EmailServcie());
        }
    }

}
