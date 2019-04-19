package com.javacore.steve.command;

public abstract class Command {
    public String name;
    public abstract void execute();

    public Command(String name) {
        this.name = name;
    }
}
