package com.codecool.helloworld;

import java.util.Scanner;

public class HelloInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        sc.close();

        if (name.equals("")) {
            name = "World";
        }
        /*if (!name.equals("")){
            System.out.println("Hello " + name);
        }*/

        System.out.println("Hello " + name);

    }
}
