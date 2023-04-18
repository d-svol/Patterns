package net.catalog.structural.decorator;

public class EmailNotification implements Notification {
    private Notification notification;

    public EmailNotification() {
    }

    public EmailNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) notification.send();
        System.out.println("Email notification is sent... ");
    }
}
