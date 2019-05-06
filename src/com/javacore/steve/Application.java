package com.javacore.steve;

import com.javacore.steve.command.Command;
import com.javacore.steve.command.CommandContext;
import com.javacore.steve.command.CommandExecutor;
import com.javacore.steve.command.commands.CommandRegistry;

import java.util.Arrays;
import java.util.HashMap;
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

    //parses command line e.g. "show id 2" into:
    // command: ShowCommand
    //params map: id -> 2
    private static CommandContext parseCommand(String commandString) {
        String[] words = commandString.split("\\s+");
        String commandName = words[0];
        Command command = CommandRegistry.INSTANCE.getCommand(commandName);

        if (command == null)
            throw new RuntimeException("Command " + commandName + " is not found");

        //every key is followed by the corresponding value
        String[] params = Arrays.copyOfRange(words, 1, words.length);
        HashMap<String, String> paramsMap = new HashMap<>();
        for (int iP = 0; iP < params.length; iP += 2) {
            paramsMap.put(params[iP], params[iP + 1]);
        }


        return new CommandContext(command, paramsMap);
    }
}
