package com.javacore.steve.command.state;


public class CommandExecutionStateContext {
    protected CommandExecutionState commandExecutionState;

    public void setState(CommandExecutionState newState) {
        System.out.println("Command execution state is changed from '" + commandExecutionState.name() + "' to '" + newState.name() + "'");
        this.commandExecutionState = newState;

    }
}
