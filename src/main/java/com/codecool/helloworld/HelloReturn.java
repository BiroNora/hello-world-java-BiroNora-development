package com.codecool.helloworld;

public class HelloReturn {

    public static String getHelloMessage() {
        String hello = "Hello World";
        return hello;
    }

    public static void sayHello() {
        System.out.println(getHelloMessage());
    }
    public static void main(String[] args) {
        sayHello();
    }
}
