package Lesson4;

public abstract class Sweetness {
    protected String name;
    protected double weight;
    protected int cost;

    public Sweetness(String name, double weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public String getInfo() {
        return  "Name:\t" + name +
                "\nWeight:\t" + weight +
                "\nCost:\t" + cost;
    }
}
