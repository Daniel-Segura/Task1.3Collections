package org.example.level2.ex2.core;

import org.example.level2.ex1.model.Restaurant;
import org.example.level2.ex2.model.RestaurantComparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public void executor(){
        Set<Restaurant> restauranTreeSet = new TreeSet<>(new RestaurantComparator());

        restauranTreeSet.add(new Restaurant("The Good Burguer",3));
        restauranTreeSet.add(new Restaurant("Pizza & Company",4));
        restauranTreeSet.add(new Restaurant("The Good Burguer",3));
        restauranTreeSet.add(new Restaurant("Pizza & Company",5));

        for (Restaurant r : restauranTreeSet){
            System.out.println("name: " + r.getName() + ", ranking: " + r.getRanking());
        }
    }
}

