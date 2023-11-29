package HW10;

public class Item {
    private String name;
    private double price;
    private boolean alcohol;

    public Item(String name, double price, boolean alcohol) {
        this.name = name;
        this.price = price;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAlcohol() {
        return alcohol;
    }
}
