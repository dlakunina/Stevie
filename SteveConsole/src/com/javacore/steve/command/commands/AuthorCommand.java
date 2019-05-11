package com.javacore.steve.command.commands;

import com.javacore.steve.command.Command;

import java.util.Map;

import static com.javacore.steve.Application.AUTHOR;

/**
 * Prints the name of the author.
 */
public class AuthorCommand extends Command {
    /**
     * The method constructs AuthorCommand.
     *
     * @param name the command name (i.e. the "author" or its aliases)
     */
    AuthorCommand(String name) {
        super(name, "outputs the author of Steve");
    }

    /**
     * The method prints out the author name
     */
    @Override
    public void execute(Map<String, String> params) {
        System.out.println("My " + name + " is " + AUTHOR);
    }
}
