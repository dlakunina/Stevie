package com.javacore.steve.command;

public class HelpCommand extends Command {

    HelpCommand() {
        super("help");
    }

    @Override
    public void execute(String[] params) {
        CommandRegistry.listCommands();

    }
}
