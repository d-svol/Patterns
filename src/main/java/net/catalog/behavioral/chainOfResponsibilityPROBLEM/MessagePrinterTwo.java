package net.catalog.behavioral.chainOfResponsibilityPROBLEM;

public class MessagePrinterTwo {
    public void printMessage(String message) {
        if (message.length() > 5) {
            System.out.println(message);
        }
    }
}