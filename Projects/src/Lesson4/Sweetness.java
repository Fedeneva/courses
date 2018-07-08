package Lesson4;

public class Sweetness {
    private String name;
    private double weight;
    private int cost;
    private String unique;

    public Sweetness(String name, double weight, int cost, String unique) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.unique = unique;
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
                "\nCost:\t" + cost +
                "\nUnique:\t" + unique;
    }
}
