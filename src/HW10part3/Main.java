package HW10part3;

public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException, NotDividableby3Exception, BeerTobaccoException {

        Shop shop = new Shop();
        Father father = new Father("Николай", 500);
        try {
            shop.buyFood(father, Goods.Beer, 3, Goods.Potato, 2);
        } catch (NotEnoughMoneyException | NotDividableby3Exception | BeerTobaccoException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}