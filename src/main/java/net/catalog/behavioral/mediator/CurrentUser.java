package net.catalog.behavioral.mediator;

public class CurrentUser implements User{
    Chat chat;

    public CurrentUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String text) {
        chat.sendMessage(text, this);
    }

    @Override
    public void getMessage(String text) {
        System.out.println("User get this message: " + "'" + text + "'");
    }
}
