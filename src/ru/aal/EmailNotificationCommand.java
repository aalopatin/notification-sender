package ru.aal;

public class EmailNotificationCommand implements Command{
    String text;

    public EmailNotificationCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.printf("E-mail was sent: %s\n", text);
    }
}
