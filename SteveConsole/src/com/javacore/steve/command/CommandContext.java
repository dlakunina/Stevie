package com.javacore.steve.command;

import java.util.Map;

public class CommandContext {
    private Command command;
    private Map<String, String> params;

    public CommandContext(Command command, Map<String, String> params) {
        this.command = command;
        this.params = params;
    }

    public Command getCommand() {
        return command;
    }

    public Map<String, String> getParams() {
        return params;
    }
}
