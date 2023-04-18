package net.catalog.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageVerifySender(
                new MessageAddCharacterSender(
                        new MessagePrintSender(null)));
        messageSender.send("TEXT");

        System.out.println("=========================");

        // messageSenderTwo don't work, because MessageVerifySender is not True
        MessageSender messageSenderTwo = new MessageVerifySender(
                new MessageAddCharacterSender(
                        new MessagePrintSender(null)));
        messageSender.send("TEX");
    }
}
