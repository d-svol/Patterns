package net.catalog.structural.decorator;

public class ViberNotification implements Notification {
    private Notification notification;

    public ViberNotification() {
    }

    public ViberNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) notification.send();
        System.out.println("Viber notification is sent... ");
    }
}
