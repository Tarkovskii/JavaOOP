package src.com.lesson.OOP.Ex1;

import java.util.ArrayList;
import java.util.List;

public class L1 {
    public static void main(String[] args) {
        Product water = new Product("h2o", 12.2);
        System.out.println(water +"of");

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1 +"ok");

        ArrayList<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine",12));
        tovary.add(new Product("drop",14.23));
        tovary.add(new Soda("soda", 43.3,"vkusno"));
        tovary.add(new Choclate("milka",11.2,40));


        VendingMachine mach2 = new VendingMachine(tovary);
        System.out.println(mach2);


        System.out.println( mach2.findMeName("drop"));
        System.out.println(mach2.findMePrice(12));
        System.out.println(mach2.findMePriceRange(10,13));




    }


}
