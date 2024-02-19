package MachineCoding_HLD.MockInterview.unicards.controller;

import MachineCoding_HLD.MockInterview.unicards.controller.models.TouchpointModel;
import MachineCoding_HLD.MockInterview.unicards.controller.service.MessageRegistory;
import MachineCoding_HLD.MockInterview.unicards.controller.service.MessageService;


// @api("v1/touchpoint")
public class TouchpointController {
    MessageRegistory messageRegistory;
    public TouchpointController(MessageRegistory messageRegistory){
        this.messageRegistory = messageRegistory;
    }

    // ("/redirectTo")
    public void redirect(TouchpointModel touchpointModel) throws Exception {
        // validation layer.
        //  Touchpoint service.
        MessageService messageService = messageRegistory.getMessageServiceType(touchpointModel.getMessagingType());
        messageService.send(touchpointModel);
    }

}
