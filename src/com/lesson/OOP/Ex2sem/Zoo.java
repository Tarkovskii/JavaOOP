package src.com.lesson.OOP.Ex2sem;

import com.sun.java.accessibility.util.SwingEventMonitor;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animals> animals = new ArrayList<>();

    public List<Animals> getAnimals() {
        return animals;
    }


    public Zoo addAnimal(Animals animal) {
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "animals=" + animals +
                '}';
    }

    public String talk() {
        StringBuilder sb = new StringBuilder();
        for (Speakable item : getSpeakable()) {
            sb.append(item.speak() + "\n");
        }
        return sb.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animals item : animals) {
            if (item instanceof Speakable) {
                result.add((Speakable) item);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animals item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }

    public int getSpeedChampion() {
        int max = 0;
        for (Runable item : getRunable()) {
            if (item.runSpeed() > max) {
                max = item.runSpeed();
            }
        }
        return max;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animals item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public int getChampionFly() {
        int max = 0;
        for (Flyable item : getFlyable()) {
            if (item.flySpeed() > max) {
                max = item.flySpeed();
            }
        }
        return max;
    }

    public List<Swimmable> getSwimmable(){
        List<Swimmable> result = new ArrayList<>();
        for (Animals item: animals) {
            if(item instanceof Swimmable){
                result.add((Swimmable) item);
            }
        }
        return result;
    }

    public int getChampionSwim(){
        int max = 0;
        for (Swimmable item: getSwimmable()) {
            if (item.swimSpeed() > max) {
                max = item.swimSpeed();
            }
        }
        return max;
    }
}
