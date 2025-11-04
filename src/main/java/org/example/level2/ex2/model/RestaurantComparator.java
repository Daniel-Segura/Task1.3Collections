package org.example.level2.ex2.model;

import java.util.Comparator;

import org.example.level2.ex1.model.Restaurant;

public class RestaurantComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        int nameCompare = r1.getName().compareToIgnoreCase(r2.getName());

        if (nameCompare != 0){
            return nameCompare;
        }
        return Integer.compare(r2.getRanking(),r1.getRanking());
    }
}


