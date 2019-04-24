package com.javacore.steve.command;

import java.util.Map;

public class HelpCommand extends Command {

    HelpCommand() {
        super("help");
    }

    @Override
    public void execute(Map<String, String> params) {
        CommandRegistry.listCommands();

    }
}
