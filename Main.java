package ru.mirea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>states = new ArrayList<String>();
        states.add("BMW");
        states.add("AUDI");
        states.add("Lexus");
        states.add("АвтоВАЗ");
        states.add(1, "Dodge");

        System.out.println(states.get(1));
        states.set(1, "УАЗ");

        System.out.printf("В списке %d элементов \n", states.size());
        for (String state: states){
            System.out.println(state);
        }

        if (states.contains("BMW")){
            System.out.println("Список содержит автомобиль BMW");
        }

        states.remove("BMW");
        states.remove(0);

        Object[] countries = states.toArray();
        for (Object country : countries){
            System.out.println(country);
        }
    }
}
