package HW8;

import java.util.Objects;

public class Computer {

//    1)
//    Создать класс Computer c конструктором принимающим параметры
//    Марка тип String, цена тип int, оперативная память тип int,
//    и видеокарта тип int.
//    Переопределить метод toString для вывода объекта класса в след. виде:
////            "Создан PC.
//    Имя = марка.
//            Цена = цена.
//            Видеокарта = объем видеокарты.
//    ОЗУ = Объем оперативной памяти."
////    Все поля класса Computer должны быть приватными.
//    Также создайте публичные методы для получения информации о полях класса Computer.
////    А также методы для изменения его полей.
//    Переопределите метод equals и метод hashCode для вашего класса.
//    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
//    равны значения полей марка, оперативная память и видеокарта.
//    равны значения полей марка, оперативная память и видеокарта.
//    В отдельном классе создайте объект класса компьютер, и выведите в консоль
//    информацию о вашем объекте

    private String name;
    private int price;
    private int memory;
    private int videoCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public Computer(String name, int price, int memory, int videoCard) {
        this.name = name;
        this.price = price;
        this.memory = memory;
        this.videoCard = videoCard;
    }
    public void getInfo(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(memory);
        System.out.println(videoCard);
    }
@Override
public String toString(){
        return "Создан PC. \n" +
                "Имя " + name + "\n" + "Цена " + price + "\n" + "Видеокарта " +
        videoCard + "\n" +             "ОЗУ " + memory;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return memory == computer.memory && videoCard == computer.videoCard && Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memory, videoCard);
    }

    public static void main(String[] args) {
        Computer computer = new Computer("HP",6000, 512, 34);
        Computer computer2 = new Computer("HP",6000, 512, 34);
        System.out.println(computer);
        System.out.println(computer.equals(computer2));
        computer.getInfo();


    }

}
