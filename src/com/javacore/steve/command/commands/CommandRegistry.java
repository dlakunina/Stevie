package com.javacore.steve.command.commands;

import com.javacore.steve.command.Command;

import java.util.HashMap;
import java.util.Map;

public enum CommandRegistry {
    INSTANCE;

    /**
     * the Map of all possible commands
     * the keys are the aliases of the commands
     * the command objects are created as values
     */


    private static Map<String, Command> commands;


    static {
        commands = new HashMap<>();
        commands.put("version", new VersionCommand("version"));
        commands.put("author", new AuthorCommand("author"));
        commands.put("creator", new AuthorCommand("creator"));
        commands.put("father", new AuthorCommand("father"));
        commands.put("exit", new ExitCommand());
        commands.put("bye", new ExitCommand());
        commands.put("help", new HelpCommand());
        commands.put("show", new ShowCommand());
        commands.put("sleep", new SleepCommand());
    }

    /**
     * prints out all the supported commands
     */
    public static void listCommands() {
        for (Map.Entry<String, Command> entry : commands.entrySet()) {
            System.out.println(entry.getKey());
            if (entry.getValue().description != null)
                System.out.println("\t* " + entry.getValue().description);
        }
    }

    /**
     * checks if the command is supported
     *
     * @param name the name of the command or one of its aliases
     * @return the boolean value of if the command is supported
     */
    public boolean hasCommand(String name) {
        return commands.containsKey(name);
    }

    /**
     * returns the command object by its name
     *
     * @param name the name of the command
     * @return the command object
     */
    public Command getCommand(String name) {
        return commands.get(name);
    }
}
