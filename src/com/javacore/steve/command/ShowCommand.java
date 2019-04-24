package com.javacore.steve.command;

import com.javacore.steve.canvas.ConsoleCanvas;

import java.util.Map;

public class ShowCommand extends Command {
    public ShowCommand() {
        super("show", "shows the criminal's profile by his/her id");
    }

    @Override
    public void execute(Map<String, String> params) {
        showProfile(params.get("id"));
    }

    private void showProfile(String id) {
        System.out.println("Showing profile with id '" + id + "'");
        ConsoleCanvas canvas = new ConsoleCanvas(20, 40);


        canvas.drawCircle(10, 7, 5);
        canvas.drawSquare(15, 2, 10);
        canvas.draw();
    }
}
