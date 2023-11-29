package HW10;

public class Main {
    public static void main(String[] args) {
       Shop shop = new Shop("Goods");
       shop.returnCost(new Buyer("Petro",16,true),
                        new Seller("Ivan", false), new Item("пиво", 500, true));
    }

}
