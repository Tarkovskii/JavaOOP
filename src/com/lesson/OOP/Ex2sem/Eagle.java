package src.com.lesson.OOP.Ex2sem;

public class Eagle extends Animals implements Speakable,Runable,Flyable{
    public Eagle(String nikname, int legs, String owner) {
        super(nikname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 100;
    }

    @Override
    public int runSpeed() {
        return 10;
    }

    @Override
    public String speak() {
        return "fiy";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
