package Lesson4;

public class Candy extends Sweetness {
    private String color;

    public Candy(String name, double weight, int cost, String color) {
        super(name, weight, cost);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nColor:\t" + color;
    }
}
