package pe.cordova.consoleapp;

import pe.cordova.service.EmailService;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World " + new EmailService().GenerateEmail("miguel","tcs.com"));



    }

}
