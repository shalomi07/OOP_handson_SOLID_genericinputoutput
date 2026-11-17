package notifikasi_multiplatform;

public class WhatsAppNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}
