package com.javacore.steve.db;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            new DBServer().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
