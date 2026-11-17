package notifikasi_multiplatform;

public class SMSNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}
