package org.example.level2.ex1.model;
import java.util.Objects;

public class Restaurant {
    private final String name;
    private int ranking;

    public Restaurant(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant restaurant1 = (Restaurant) o;
        return ranking == restaurant1.ranking && Objects.equals(name, restaurant1.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, ranking);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}

