package Lesson4;

public class Chocolate extends Sweetness{
    private String filling;

    public Chocolate(String name, double weight, int cost, String filling) {
        super(name, weight, cost);
        this.filling = filling;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nFilling:" + filling;
    }
}
