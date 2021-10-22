# Hello World

## Story

No debate that your first programming exercise must be a [Hello, World!](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program) implementation. However, we don't want to bore you - let's be bold and and make your "Hello, World!" shine!

## What are you going to learn?

- Write strings to the console (that is, _printing_).
- Define and call methods.
- Use return values.
- Get user input.
- Call methods with arguments.
- Separate concerns.

## Tasks

1. Modify `HelloWorld.java` so that it prints out `Hello, World!` to the console. Do not write any methods yet.
    - Running the `main` method of `HelloWorld.java` prints out `Hello, World!` to the console.
    - The source code of `HelloWorld.java` contains only the `main()` method.

2. Create and call a method in `HelloMethod.java` which prints `Hello, World!` to the console.
    - Running `HelloMethod.java` prints out `Hello, World!` to the console.
    - The source code of `HelloMethod.java` defines and calls a `sayHello()` method which is responsible for printing the `Hello, World!` message.

3. Create and call two methods in `HelloReturn.java` - one should return the `Hello, World!` string to the other which prints this message to the console.
    - Running `HelloReturn.java` prints out `Hello, World!` to the console.
    - The source code of `HelloReturn.java` defines a `getHelloMessage()` method which does not print anything but returns the `Hello, World!` message.
    - The source code of `HelloReturn.java` defines and calls a `sayHello()` method which is responsible for printing the message returned by `getHelloMessage()`.

4. Create and call two methods in `HelloInput.java` - one should ask for the name of the user and the other prints the custom greeting message to the console.
    - Running `HelloInput.java` prints `What's your name?`, asks for user input, and using the input prints `Hello, <name>!` to the console.
    - Running `HelloInput.java` asks `What's your name?`, and if the user does not enter anything, it prints `Hello, World!` to the console.
    - The source code of `HelloInput.java` defines a `getHelloMessage()` method which prints `What's your name?`, and returns `Hello, <name>!` using the user input (or `Hello, World!` for an empty input).
    - The source code of `HelloInput.java` defines and calls a `sayHello()` method which is responsible for printing the message returned by `getHelloMessage()`.

5. Ask for the user's displayed name in a reorganized `HelloArgument.java` that separates the input collection and the message assembly parts.
    - Running `HelloArgument.java` prints `What's your name?`, asks for user input, and using the input prints `Hello, <Name>!` to the console.
    - Running `HelloArgument.java` asks `What's your name?`, and if the user does not enter anything, it prints `Hello, World!` to the console.
    - The source code of `HelloArgument.java` defines a `getUserName()` method which prints `What's your name?`, and returns the user's input string.
    - The source code of `HelloArgument.java` defines a `getHelloMessage(String name)` method which returns `Hello, <name>!` using the incoming argument (or `Hello, World!` for an empty argument).
    - The source code of `HelloArgument.java` defines and calls a `sayHello()` method which is responsible for printing the message after collecting the returned values from the other two methods.

## General requirements

None

## Hints



## Background materials

- <i class="far fa-exclamation"></i> [Java Data Types](https://www.w3schools.com/java/java_data_types.asp)
- <i class="far fa-exclamation"></i> [Java Methods](https://www.w3schools.com/java/java_methods.asp)
- <i class="far fa-exclamation"></i> [Java Method Parameters](https://www.w3schools.com/java/java_methods_param.asp)
- <i class="far fa-exclamation"></i> [Printing and asking for user input](https://www.w3schools.com/java/java_user_input.asp)
- <i class="far fa-exclamation"></i> [A step-by-step solution guide](project/curriculum/materials/pages/guides/hello-world--java.md) to this project

