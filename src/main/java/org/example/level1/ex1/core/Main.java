package org.example.level1.ex1.core;

import org.example.level1.ex1.model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> month = new ArrayList<>();

        month.add(new Month("January"));
        month.add(new Month("February"));
        month.add(new Month("March"));
        month.add(new Month("April"));
        month.add(new Month("May"));
        month.add(new Month("June"));
        month.add(new Month("July"));

        month.add(new Month("September"));
        month.add(new Month("October"));
        month.add(new Month("November"));
        month.add(new Month("December"));

        System.out.println("\nList before adding August to the correct index");

        for (Month mo : month) {
            System.out.println(mo);
        }

        month.add(7, new Month("August"));
        System.out.println("\nlist after adding August to the correct index");

        for (Month m : month) {
            System.out.println(m);
        }

        HashSet<Month> monthHashSet = new HashSet<>(month);

        monthHashSet.add(new Month("August"));
        System.out.println();
        System.out.println("\nChecking the HashSet method");
        for (Month m : monthHashSet) {
            System.out.println(m);
        }

        System.out.println("\nwe traverse list using for-each");
        for (Month m : month) {
            System.out.println(m);
        }

        System.out.println("\nwe traverse list using iterator");
        Iterator<Month> iterator = month.iterator();
        while (iterator.hasNext()) {
            Month months = iterator.next();
            System.out.println(months);
        }

    }
}
