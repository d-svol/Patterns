package net.catalog.behavioral.chainOfResponsibility;

public abstract class MessageSender {
    MessageSender messageSender;

    public MessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract void send(String msg);
}
