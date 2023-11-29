package HW10part3;

public enum Goods {
    Apple(20),
    Potato(40),
    Milk(40),
    Beer(50),
    Tobacco(100);

    private int price;

    Goods(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}