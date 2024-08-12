package net.proselyte.basepatterns.behavioral.command;

public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

}
