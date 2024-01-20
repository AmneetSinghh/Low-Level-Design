package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.service.notification;

public class EmailService implements NotificationService{
    public EmailService(){
        System.out.println("EmailService():: ");
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("sendNotification:: message ::"+ message);
    }
}
