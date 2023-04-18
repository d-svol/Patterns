package net.catalog.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification();
        Notification viberNotification = new ViberNotification();

        emailNotification.send();
        

        System.out.println("\n" + "=========================" + "\n");

        // When need all notification, we can use it
        Notification notificationAll = new EmailNotification(new SmsNotification(new ViberNotification()));
        notificationAll.send();
    }


}
