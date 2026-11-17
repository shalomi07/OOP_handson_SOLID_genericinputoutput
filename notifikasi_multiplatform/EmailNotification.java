package notifikasi_multiplatform;

public class EmailNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}
