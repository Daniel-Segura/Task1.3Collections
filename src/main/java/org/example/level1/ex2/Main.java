package org.example.level1.ex2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        List<Integer> secondList = new ArrayList<>();

        secondList.add(6);
        secondList.add(7);
        secondList.add(8);
        secondList.add(9);
        secondList.add(10);

        firstList.addAll(secondList);

        List<Integer> reverseList = new ArrayList<>();

        for (int i = firstList.size() - 1; i >= 0; i--) {
            reverseList.add(firstList.get(i));
        }
        System.out.println("Combined List" + firstList);
        System.out.println("Reverse List" + reverseList);

        System.out.println();
        System.out.println("Reverse List with Iterator");

        reverseList.clear();

        ListIterator<Integer> listIterator = firstList.listIterator(firstList.size());

        while (listIterator.hasPrevious()) {
            Integer iterator = listIterator.previous();
            reverseList.add(iterator);
        }

        System.out.println("Reverse List: " + reverseList);
    }
}