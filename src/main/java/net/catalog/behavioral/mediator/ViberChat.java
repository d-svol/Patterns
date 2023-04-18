package net.catalog.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ViberChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUsers(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String text, User user) {
        for (User currentUser : users) {
            if(currentUser != user){
                currentUser.getMessage(text);
            }
        }
    }
}