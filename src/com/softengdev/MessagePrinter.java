package com.softengdev;

/**
 * The {@code MessagePrinter} class provides functionality to print messages
 * to the console. It contains a method to print a string message.
 */
public class MessagePrinter {
    public MessagePrinter() {

    }

    /**
     * Prints the specified message to the console.
     *
     * @param message the message to be printed. If the message is {@code null}, 
     *                it will print "null".
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
}

