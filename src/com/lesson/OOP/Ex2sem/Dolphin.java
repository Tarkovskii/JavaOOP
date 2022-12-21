package src.com.lesson.OOP.Ex2sem;

public class Dolphin extends Animals implements Speakable, Swimmable {

    public Dolphin(String nikname, int legs, String owner) {
        super(nikname, legs, owner);
    }

    @Override
    public String speak() {
        return "chelk";
    }

    @Override
    public String toString() {
        return "Dolphin" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 60;
    }
}
