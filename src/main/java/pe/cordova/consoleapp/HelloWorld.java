package pe.cordova.consoleapp;

import pe.cordova.service.EmailService;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Welcome to Test Console App with Jenkins.");

        System.out.println("This is a email generator Service for: " + new EmailService().GenerateEmail("miguel","tcs.com"));

    }

}
