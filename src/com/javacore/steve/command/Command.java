package com.javacore.steve.command;

import java.util.Map;

public abstract class Command {
    public String name;
    public String description;

    public Command(String name) {
        this.name = name;
    }

    public Command(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void execute(Map<String, String> params);
}
