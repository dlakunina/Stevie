package com.javacore.steve.command.commands;

import com.javacore.steve.command.Command;

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
