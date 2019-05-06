package com.javacore.steve.command.commands;

import com.javacore.steve.command.Command;
import com.javacore.steve.profile.ProfileController;

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

        ProfileController profileController = new ProfileController();
        profileController.showProfile(Integer.parseInt(id));
    }
}
