package com.javacore.steve.command;

import java.util.HashMap;
import java.util.Iterator;
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
        commands.put("version", new com.javacore.steve.command.CommandVersion("version"));
        commands.put("author", new com.javacore.steve.command.CommandAuthor("author"));
        commands.put("creator", new com.javacore.steve.command.CommandAuthor("creator"));
        commands.put("father", new com.javacore.steve.command.CommandAuthor("father"));
        commands.put("exit", new CommandExit());
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

    /**
     * prints out all the supported commands
     */
    public void listCommands() {
        Iterator it = commands.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey());
        }
    }
}
