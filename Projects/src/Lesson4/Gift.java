package Lesson4;

import java.util.ArrayList;

public class Gift {
    private ArrayList<Sweetness> sweets;
    private double weight;
    private int cost;

    public Gift() {
        sweets = new ArrayList<>();
        weight = 0;
        cost = 0;
    }

    /**
     * Adds new sweetness to the gift.
     *
     * @param newSweetness - new sweetness
     */
    public void addSweetness(Sweetness newSweetness) {
        sweets.add(newSweetness);
        weight += newSweetness.getWeight();
        cost += newSweetness.getCost();
    }

    public double getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public void printInfo() {
        System.out.printf("There are %d sweets.\n", sweets.size());
        for (Sweetness sweetness : sweets) {
            System.out.println(
                    "=====================\n" +
                            sweetness.getInfo()
            );
        }
        if (sweets.size() != 0) {
            System.out.println(
                    "=====================\n" +
                            "Total:"+
                            "\n\tWeight:\t" + weight +
                            "\n\tCost:\t" + cost
            );
        }
    }
}
