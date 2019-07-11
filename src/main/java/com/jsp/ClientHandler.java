package com.jsp;

import java.util.ArrayList;
import java.util.List;

public class ClientHandler {

    public static StringBuilder randomDocument() {
        StringBuilder document = new StringBuilder();
        for (int j = 0; j < 11; j++) {
            if (j == 3 || j == 6) {
                document.append(".");
            } else if (j == 9) {
                document.append("-");
            }
            Double digitD = Math.random() * 10;
            Integer digit = digitD.intValue();
            document.append(digit);
        }
        return document;
    }

    public static String randomFullname(List<String> firstNameList, List<String> lastNameList) {
        Double nameIndexD = (Math.random() * 7);
        Integer nameIndex = nameIndexD.intValue();
        Double lastNameIndexD = (Math.random() * 7);
        Integer lastNameIndex = lastNameIndexD.intValue();
        return firstNameList.get(nameIndex) + lastNameList.get(lastNameIndex);
    }

    public static Integer randomAgeBetween20And60() {
        Double ageD = (Math.random() * 40) + 20;
        return ageD.intValue();
    }

    public static List<String> createLastNameList() {
        List<String> lastNameList = new ArrayList<>();
        lastNameList.add(" Bittencourt");
        lastNameList.add(" Green");
        lastNameList.add(" Clinton");
        lastNameList.add(" Roger");
        lastNameList.add(" Stark");
        lastNameList.add(" Piterson");
        lastNameList.add(" Geller");
        return lastNameList;
    }

    public static List<String> createFirstNameList() {
        List<String> firstNameList = new ArrayList<>();
        firstNameList.add("Olivia");
        firstNameList.add("Paul");
        firstNameList.add("Todd");
        firstNameList.add("Henry");
        firstNameList.add("Brenda");
        firstNameList.add("Holly");
        firstNameList.add("John");
        return firstNameList;
    }
}
