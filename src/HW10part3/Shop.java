package HW10part3;

public class Shop {
    public void buyFood(Father father, Goods product1, int quantityOfProduct1,
                        Goods product2, int quantityOfProduct2) throws NotEnoughMoneyException, BeerTobaccoException, NotDividableby3Exception {
        int totalCost = product1.getPrice()*quantityOfProduct1 + product2.getPrice()*quantityOfProduct2;
        if (totalCost > father.getMoney()){
            throw new NotEnoughMoneyException("Растратил все деньги");
        }if (product1 == Goods.Beer && product2 == Goods.Tobacco || product1 ==Goods.Tobacco && product2== Goods.Beer) {
            throw new BeerTobaccoException("Табак и пиво - убьешь печень");
        } if ((quantityOfProduct1 % 3 !=0) && (quantityOfProduct2 % 3 != 0)) {
            throw new NotDividableby3Exception("Нужно поделиться с семьей, эгоист");
        }
            System.out.println("Уважаемый " + father.getName() + ", " + "стоимость ваших покупок " + totalCost + ". " + "Вы приобрели " + product1 +
                    " в количестве " + quantityOfProduct1 + " и " + product2 + " в количестве " + quantityOfProduct2);
            }

        }
