package ru.aal;

public class SmsNotificationCommand implements Command{
    String text;

    public SmsNotificationCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.printf("SMS was sent: %s\n", text);
    }
}
