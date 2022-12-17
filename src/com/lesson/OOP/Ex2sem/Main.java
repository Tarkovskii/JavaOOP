package src.com.lesson.OOP.Ex2sem;

import src.com.lesson.OOP.Ex1.Soda;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("Dusya",4,"Borat"))
                .addAnimal(new Cat("Murka",4,"Borya"))
                .addAnimal(new Duck("Donald",2,"Vasya"))
                .addAnimal(new Eagle("Eddy",2,"Mongol"));

        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
        System.out.println("--------------------");
        System.out.println(zoo.getSpeedChampion());
        System.out.println("--------------------");
        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.flySpeed());
        }
        System.out.println("---------------------");
        System.out.println(zoo.getChampionFly());

        Save caveMenedgwe = new Save();
        caveMenedgwe.save(zoo.getAnimals());

    }
}
