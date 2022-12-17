package src.com.lesson.OOP.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    ArrayList<Product> prodList;

    public static ArrayList<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("rock", 3)));

    public VendingMachine(ArrayList<Product> prodList) {
        this.prodList = prodList;
    }

    public VendingMachine() {
        this(DEFAULT);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        prodList.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public ArrayList<Product> findMeName(String name) {
        return finder(p -> p.getName().equals(name));
    }

    public ArrayList<Product> findMePrice(double d1) {
        return finder(p -> p.getPrice() == d1);
    }


    public ArrayList<Product> findMePriceRange(double d1, double d2) {
        return finder(p -> p.getPrice() >= d1 && p.getPrice() <= d2);
    }

    private ArrayList finder(Function<Product, Boolean> f) {
        ArrayList<Product> result = new ArrayList<>();
        prodList.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;

    }
}



