package com.javacore.steve.command.commands;

import com.javacore.steve.command.Command;

import java.util.Map;

public class SleepCommand extends Command {
    public SleepCommand() {
        super("sleep", "Sleeps for 10 seconds");
    }

    @Override
    public void execute(Map<String, String> params) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
