package com.javacore.steve.command.state;

import com.javacore.steve.command.Command;
import com.javacore.steve.command.CommandContext;

public class IdleState extends CommandExecutionState {

    public IdleState(CommandExecutionStateContext stateContext) {
        super(stateContext);
    }

    @Override
    public void tryRun(CommandContext commandContext) {
        Thread thread =
                new Thread() {
                    public void run() {
                        Command command = commandContext.getCommand();
                        command.execute(commandContext.getParams());
                        System.out.println("Finished execution of command '" + commandContext.getCommand().name + "'");
                        stateContext.setState(new IdleState(stateContext));
                    }
                };
        System.out.println("Started execution of command '" + commandContext.getCommand().name + "'");
        thread.start();

        stateContext.setState(new RunningState(stateContext, commandContext));
    }

    @Override
    public String name() {
        return "Idle";
    }
}
