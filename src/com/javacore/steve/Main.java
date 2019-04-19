package com.javacore.steve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.nextLine();
        } while (!s.equals("exit"));
    }
}
