package com.javacore.steve.command.state;

import com.javacore.steve.command.CommandContext;

public class RunningState extends CommandExecutionState {
    private CommandContext runningCommand;

    public RunningState(CommandExecutionStateContext stateContext, CommandContext runningCommand) {
        super(stateContext);
        this.runningCommand = runningCommand;
    }

    @Override
    public void tryRun(CommandContext commandContext) {
        System.out.println("Can't execute command '" + commandContext.getCommand().name + "', as the command '" + runningCommand.getCommand().name + "' is running");
    }

    @Override
    public String name() {
        return "Running";
    }

}
