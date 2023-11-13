package HW8;

public class Tree {
    private String type;
    private int height;
    private int countOfsticks;
    private String colour;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCountOfsticks() {
        return countOfsticks;
    }

    public void setCountOfsticks(int countOfsticks) {
        this.countOfsticks = countOfsticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfsticks = 13;
        this.colour = "зеленый";
    }
    public Tree(int height, int countOfsticks, String colour) {
        this.type = "пихта";
        this.height = height;
        this.countOfsticks = countOfsticks;
        this.colour = colour;
    }
    public Tree() {
        this.height = 350;
        this.countOfsticks = 29;
        this.colour = "желтый";
    }
    public Tree(String type) {
        this();
        this.type = type;

    }

    public static void main(String[] args) {
        Tree tree1 = new Tree("Пихта",300);
        System.out.println("Конструктор 1: " + "\n"+ "Название дерева: " + tree1.type + " " + "Высота дерева: " + tree1.height + " " + "Количество веток: " + tree1.countOfsticks
                + " " +   "Цвет дерева: " + tree1.colour);

        Tree tree2 = new Tree(300, 23, "зеленый");
        System.out.println("Конструктор 2: " + "\n" + "Название дерева: " + tree2.type + " " + "Высота дерева: " + tree2.height + " " + "Количество веток: " + tree2.countOfsticks
                + " " +   "Цвет дерева: " + tree2.colour);

        Tree tree3 = new Tree();
        System.out.println("Конструктор 3: " + "\n" + "Высота дерева: " + tree3.height + " " + "Количество веток: " + tree3.countOfsticks
                + " " +   "Цвет дерева: " + tree3.colour);
        Tree tree4 = new Tree("Пихта");
        System.out.println("Конструктор 4: " + "\n" + "Название дерева: " + tree4.type + " " + "Высота дерева: " + tree4.height + " " + "Количество веток: " + tree4.countOfsticks
                + " " +   "Цвет дерева: " + tree4.colour);
    }}