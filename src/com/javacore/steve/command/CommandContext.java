package com.javacore.steve.command;

public class CommandContext {
    private Command command;
    private String[] params;

    public CommandContext(Command command, String[] params) {
        this.command = command;
        this.params = params;
    }

    public Command getCommand() {
        return command;
    }

    public String[] getParams() {
        return params;
    }
}
