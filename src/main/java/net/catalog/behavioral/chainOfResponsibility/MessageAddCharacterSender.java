package net.catalog.behavioral.chainOfResponsibility;

public class MessageAddCharacterSender extends MessageSender{
    public MessageAddCharacterSender(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void send(String msg) {
        messageSender.send( msg + "!!!");
    }
}
