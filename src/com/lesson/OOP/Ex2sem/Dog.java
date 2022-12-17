package src.com.lesson.OOP.Ex2sem;

public class Dog extends Animals implements Speakable,Runable{

    public Dog(String nikname, int legs, String owner) {
        super(nikname, legs, owner);
    }

    @Override
    public String speak() {
        return "woow";
    }

    @Override
    public int runSpeed() {
        return 60;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
