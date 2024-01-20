package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.service.notification;

public class SmsService implements NotificationService{
    public SmsService(){
        System.out.println("SmsService():: ");
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("sendNotification:: message ::"+ message);
    }
}
