package org.example.level2.ex1.core;
import org.example.level2.ex1.model.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class AppRunner {
    public void executor(){

        Set<Restaurant> restaurantHashSet = new HashSet<>();

        restaurantHashSet.add(new Restaurant("Pans & Company",5));
        restaurantHashSet.add(new Restaurant("Pans & Company",3));
        restaurantHashSet.add(new Restaurant("La Sureña",4));
        restaurantHashSet.add(new Restaurant("La Sureña",4));

        System.out.println("Restaurants: ");
        for (Restaurant r : restaurantHashSet){
            System.out.println(r);
        }
    }

}

