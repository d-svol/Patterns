package net.catalog.behavioral.mediator;

public class Admin implements User{
    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String text) {
        chat.sendMessage(text, this);
    }

    @Override
    public void getMessage(String text) {
        System.out.println("Admin get this message: " + "'" + text + "'");
    }
}
