package src.com.lesson.OOP.Ex2sem;

public class Cat extends Animals implements Speakable, Runable, Swimmable{

    public Cat(String nikname, int legs, String owner) {
        super(nikname, legs, owner);
    }

    @Override
    public String speak() {
        return "miyau";
    }

    @Override
    public int runSpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 5;
    }
}
