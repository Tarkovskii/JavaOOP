package src.com.lesson.OOP.Ex1;

public class Choclate extends Product{
    public Choclate(String name, double price, int weight) {
        super(name, price);
        this.setWeight(weight);
    }

    public int getWeight(){
        return weight;
    }

    private void setWeight(int weight){
        this.weight = weight;
    }

    private int weight;

    public String toString() {
        return String.format("%s, %sгр.",super.toString(),weight);
    }
}
