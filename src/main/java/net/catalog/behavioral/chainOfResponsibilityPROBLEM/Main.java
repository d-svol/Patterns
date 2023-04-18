package net.catalog.behavioral.chainOfResponsibilityPROBLEM;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender(new MessagePrinter());
        messageSender.sendMessage("Hello");

//        NOT WORK. Need create new MessageSender->and put constructorMessagePrinterTWO
//        MessageSender message = new MessageSender(new MessagePrinterTwo());
//        messageSender.sendMessage("Hello");
    }
}
