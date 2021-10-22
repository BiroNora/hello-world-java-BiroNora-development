package com.codecool.helloworld;

import java.util.Scanner;

public class HelloArgument {

    public static String getUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        sc.close();
        return name;
    }

    public static String getHelloMessage(String name) {
        if (name.equals("")) {
            name = "Word";
        }
        return "Hello, " + name +"!";
    }

    public static void sayHello() {
        System.out.println(getHelloMessage(getUserName()));
    }

    public static void main(String[] args) {
        sayHello();
    }
}
