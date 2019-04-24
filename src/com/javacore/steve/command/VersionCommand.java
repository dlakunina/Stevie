package com.javacore.steve.command;

import java.util.Map;

import static com.javacore.steve.Application.VERSION;

/**
 * The command that outputs the current version of the program
 */
public class VersionCommand extends Command {

    /**
     * constructs the VersionCommand
     *
     * @param name the name of the command (i.e. the "version")
     */
    VersionCommand(String name) {

        super(name);
    }

    /**
     * The method prints out the version of the program
     */
    @Override
    public void execute(Map<String, String> params) {

        System.out.println("My version is " + VERSION);
    }
}

