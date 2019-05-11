package com.javacore.steve.command;


import com.javacore.steve.command.state.CommandExecutionStateContext;
import com.javacore.steve.command.state.IdleState;


public class CommandExecutor extends CommandExecutionStateContext {

    public CommandExecutor() {
        commandExecutionState = new IdleState(this);
    }

    public void run(CommandContext commandContext) {
        commandExecutionState.tryRun(commandContext);
    }


}
