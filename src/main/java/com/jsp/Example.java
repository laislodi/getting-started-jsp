package com.jsp;

import java.util.List;

/**
 * This class is used to test the code logic
 */
public class Example {

    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("This message will be written ");
        double floor = Math.floor(Math.random()*100);
        for (int i = 0; i < floor; i++) {
            System.out.print(message);
            System.out.println(i + " times.");
        }

        long id = 1L;
        List<String> firstNameList = ClientHandler.createFirstNameList();
        List<String> lastNameList = ClientHandler.createLastNameList();

        for (int i = 0; i < 10; i++) {
            Integer age = ClientHandler.randomAgeBetween20And60();
            String fullname = ClientHandler.randomFullname(firstNameList, lastNameList);
            StringBuilder document = ClientHandler.randomDocument();
            Client client = new Client(id++, fullname, document.toString(), age);
            System.out.println(client);
        }
    }



}
