package net.proselyte.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat  {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

}
