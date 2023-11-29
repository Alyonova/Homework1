package HW10;

public class Buyer {
    private String name;
    private int age;
    private boolean hasDiscount;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public Buyer(String name, int age, boolean hasDiscount) {
        this.name = name;
        this.age = age;
        this.hasDiscount = hasDiscount;

    }

    public double discountApplied(Buyer buyer, Item item) {
        double cost = item.getPrice();
        if (buyer.isHasDiscount()) {
            return cost = cost - item.getPrice() * 0.1;
        } else {
            return cost;

        }

    }
}
