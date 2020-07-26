package ru.geekbrains.part2.lesson3;

import java.security.Signature;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    protected static HashMap<String,String> book;
    public Phonebook() {
        book = new HashMap<String,String>();
    }

    public static void add(String phone, String name)
    {
         book.put(phone,name);
    }
    public static void showAll()
    {
        System.out.println(book);
    }
    public static void get(String element){
        for (Map.Entry<String, String> o : book.entrySet()) {
            if (element.equals(o.getValue())) {
                System.out.println(o.getKey() + ": " + o.getValue());
            }
        }
    }
}
