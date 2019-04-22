package com.javacore.steve;

import com.javacore.steve.command.Command;
import com.javacore.steve.command.CommandContext;
import com.javacore.steve.command.CommandRegistry;
import com.javacore.steve.executor.CommandExecutor;

import java.util.Arrays;
import java.util.Scanner;


public class Application {

    public static final String AUTHOR = "Daria";

    public static final String VERSION = "0.0.0";

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String commandString;
        CommandExecutor executor = new CommandExecutor();
        while (true) {
            try {
                commandString = scanner.nextLine();
                CommandContext commandContext = parseCommand(commandString);
                if (commandContext.getCommand().name.equals("exit"))
                    return;
                executor.run(commandContext);
            } catch (RuntimeException ex) {
                System.out.println(ex);
            }
        }
    }

    private static CommandContext parseCommand(String commandString) {
        String[] words = commandString.split("\\s+");
        String commandName = words[0];
        Command command = CommandRegistry.INSTANCE.getCommand(commandName);

        if (command == null)
            throw new RuntimeException("Command " + commandName + " is not found");

        String[] params = Arrays.copyOfRange(words, 1, words.length);
        return new CommandContext(command, params);
    }
}
