package ru.geekbrains.part2.lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        checkUnique();
        System.out.println();
        checkPhoneBook();
    }
    public static void checkUnique(){
        ArrayList<String> arr_str = new ArrayList<>();
        arr_str.add("Pavel");
        arr_str.add("Igor");
        arr_str.add("Michael");
        arr_str.add("Igor");
        arr_str.add("Alex");
        arr_str.add("Victoria");
        arr_str.add("Anna");
        arr_str.add("Alex");
        System.out.println(arr_str);
        System.out.println();
        HashSet<String> h_str = new HashSet<>(arr_str);
        System.out.println(h_str);
        System.out.println();
        for (String element:h_str){
            int counter = Collections.frequency(arr_str,element);
            System.out.printf("Value %s find %s unsages \n",element,counter);
        }
    }
    public static void checkPhoneBook(){
        Phonebook pb = new Phonebook();
        pb.add("88009998887766","Pavel");
        pb.add("88008887776655","Igor");
        pb.add("88007776665544","Michael");
        pb.add("88006665554433","Igor");
        pb.add("88005554443322","Alex");
        pb.add("88004443332211","Victoria");
        pb.add("88003332221100","Anna");
        pb.add("88002221110099","Alex");
        pb.showAll();
        System.out.println();
        pb.get("Igor");
        pb.get("Anna");
    }




}
