package notifikasi_multiplatform;

import java.util.Arrays;
import java.util.List;

public class Service {
    private List<NotificationService> notifier;

    public Service(List<NotificationService> notifier){
        this.notifier = notifier;
    }

    public void notify(String message){
        for (NotificationService notifiers : notifier){
            notifiers.sendMessage(message);
        }

    }

    public static void main(String[] args) {
        Service notif = new Service(Arrays.asList(
                new EmailNotification(),
                new SMSNotification(),
                new WhatsAppNotification()
        ));

        notif.notify("Halo, ini pesan pengujian dari notifikasi_multiplatform.NotificationService");
    }
}
