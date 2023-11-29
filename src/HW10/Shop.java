package HW10;

public class Shop implements ReturnCost{
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void returnCost(Buyer buyer, Seller seller, Item item) {
        if (seller.isHonest() && buyer.getAge()<18 && item.isAlcohol()){
            System.out.println("Не продаем товары несовершеннолетним");
        } else if (buyer.isHasDiscount()){
            System.out.println("Уважаемый " + buyer.getName() + ", " + "продавец "
                    +  seller.getName() + " нашего магазина " +name+ " " +
                    "продаст вам " +item.getName()+ ". "
                    + "Стоимость вашей покупки равна "  + item.getPrice() + " " +
                    "Со скидкой  " + buyer.discountApplied(buyer, item));

        } else{
            System.out.println("Уважаемый " + buyer.getName() + ", " + "продавец "
                    +  seller.getName() + " нашего магазина " +name+ " " +
                    "продаст вам " +item.getName()+ ". "
                    + "Стоимость вашей покупки равна "  + item.getPrice() + " ");
        }
    }
}
