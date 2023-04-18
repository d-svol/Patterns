package net.catalog.behavioral.chainOfResponsibility;

public class MessageVerifySender extends MessageSender{
    public MessageVerifySender(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void send(String msg) {
        if (!msg.matches("\\d") && (msg.length() >= 4)){
            messageSender.send(msg);
        }
    }
}
