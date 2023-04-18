package net.catalog.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ViberChat viberChat = new ViberChat();
        User admin = new Admin(viberChat);
        User user1 = new CurrentUser(viberChat);
        User user2 = new CurrentUser(viberChat);

        viberChat.addUsers(admin);
        viberChat.addUsers(user1);
        viberChat.addUsers(user2);

        user1.sendMessage("Hello world");
        System.out.println("=================");
        admin.sendMessage("I'm admin, hi all meet me!");

    }
}
