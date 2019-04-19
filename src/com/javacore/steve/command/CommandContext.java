package com.javacore.steve.command;

import java.sql.DriverPropertyInfo;

public class CommandContext {
    public Command getCommand() {
        return command;
    }

    public CommandContext(Command command) {
        this.command = command;
    }

    private Command command;
}
