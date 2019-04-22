package com.javacore.steve.command;

import com.javacore.steve.canvas.ConsoleCanvas;

public class ShowCommand extends Command {
    public ShowCommand() {
        super("show", "show the criminal's profile by his/her id");
    }

    @Override
    public void execute(String[] params) {
        ConsoleCanvas canvas = new ConsoleCanvas(20, 40);
        canvas.drawCircle(10, 7, 5);
        canvas.drawSquare(15, 2, 10);
        canvas.draw();
    }
}
