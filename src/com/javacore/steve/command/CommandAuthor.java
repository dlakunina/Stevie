package com.javacore.steve.command;

import static com.javacore.steve.Application.AUTHOR;

/**
 * Prints the name of the author.
 */
public class CommandAuthor extends Command {
    /**The method constructs CommandAuthor.
     * @param name the command name (i.e. the "author" or its aliases)
     */
    public CommandAuthor(String name) {
        super(name, "outputs the author of Steve");
    }

    /**
     *The method prints out the author name
     */
    @Override
    public void execute(String[] params) {
        System.out.println("My " + name + " is " + AUTHOR);
    }
}
