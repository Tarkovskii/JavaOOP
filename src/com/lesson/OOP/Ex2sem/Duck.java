package src.com.lesson.OOP.Ex2sem;

public class Duck extends Animals implements Speakable,Runable,Flyable{

    public Duck(String nikname, int legs, String owner) {
        super(nikname, legs, owner);
    }

    @Override
    public int runSpeed() {
        return 10;
    }

    @Override
    public String speak() {
        return "Kyra";
    }

    @Override
    public int flySpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
