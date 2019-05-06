package com.javacore.steve.command.commands;

import com.javacore.steve.command.Command;

import java.util.Map;

public class ExitCommand extends Command {
    ExitCommand() {
        super("exit");
    }

    @Override
    public void execute(Map<String, String> params) {

    }
}
