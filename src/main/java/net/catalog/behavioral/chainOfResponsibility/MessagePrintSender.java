package net.catalog.behavioral.chainOfResponsibility;

public class MessagePrintSender extends MessageSender{

    public MessagePrintSender(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void send(String msg) {
            System.out.println(msg);
    }
}
