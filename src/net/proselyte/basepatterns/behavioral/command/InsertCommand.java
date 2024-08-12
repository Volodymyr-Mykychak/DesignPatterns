package net.proselyte.basepatterns.behavioral.command;

public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

}
