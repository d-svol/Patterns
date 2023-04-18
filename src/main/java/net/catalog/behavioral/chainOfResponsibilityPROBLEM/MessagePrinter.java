package net.catalog.behavioral.chainOfResponsibilityPROBLEM;


public class MessagePrinter {
    public void printMessage(String message) {
        if (!message.matches(".*\\d.*")){
            System.out.println(message);
        }
    }
}
