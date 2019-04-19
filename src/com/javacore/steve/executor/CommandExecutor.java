package com.javacore.steve.executor;

import com.javacore.steve.command.CommandContext;

public class CommandExecutor {
    public void run(CommandContext commandContext) {
        commandContext.getCommand().execute();
    }
}
