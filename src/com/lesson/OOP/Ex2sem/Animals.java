package src.com.lesson.OOP.Ex2sem;

public abstract class Animals {

    private String nikname;
    private int legs;
    private String owner;

    public String getNikname() {
        return nikname;
    }

    public int getLegs() {
        return legs;
    }

    public String getOwner() {
        return owner;
    }

    public Animals(String nikname, int legs, String owner) {
        this.nikname = nikname;
        this.legs = legs;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "nikname='" + nikname + '\'' +
                ", legs=" + legs +
                ", owner='" + owner + '\'' +
                '}' +"\n";
    }

    //public abstract String speak();
}
