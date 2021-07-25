package ru.aal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class Sender {
    Command smsLink = new SmsNotificationCommand("link to download Application.");
    Command emailApplication = new EmailNotificationCommand("your Application.");
    Command smsNotification = new SmsNotificationCommand("application was sent.");

    public void send(int mode) {
        switch (mode) {
            case 1:
                smsLink.execute();
                break;
            case 2:
                emailApplication.execute();
                smsNotification.execute();
                break;
            case 3:
                smsLink.execute();
                emailApplication.execute();
                smsNotification.execute();
        }

    }
}
