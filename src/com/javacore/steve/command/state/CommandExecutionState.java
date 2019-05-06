package com.javacore.steve.command.state;

import com.javacore.steve.command.CommandContext;

public abstract class CommandExecutionState {
    protected CommandExecutionStateContext stateContext;

    public CommandExecutionState(CommandExecutionStateContext stateContext) {
        this.stateContext = stateContext;
    }

    public abstract void tryRun(CommandContext commandContext);

    public abstract String name();
}
