package HW8;

public class Converter {
    private String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int convertToInt(byte b) {
        return b;
    }

    public int convertToInt(int i) {
        return i;
    }

    public int convertToInt(long l) {
        return (int) l;
    }

    public int convertToInt(char c) {
        return c;
    }

    public int convertToInt(float f) {
        return (int) f;
    }

    public int convertToInt(double d) {
        return (int) d;
    }

    public int convertToInt(String string) {
        return Integer.parseInt(string);

    }

    public int convertToInt(boolean bo) {
        System.out.println("введен тип boolean");
        return 0;
    }

    public double convertToDouble(byte b) {
        return b;
    }

    public double convertToDouble(int i) {
        return i;
    }

    public double convertToDouble(long l) {
        return (int) l;
    }

    public double convertToDouble(char c) {
        return c;
    }

    public double convertToDouble(float f) {
        return (double) f;
    }

    public double convertToDouble(double d) {
        return d;
    }

    public double convertToDouble(String string) {
        return Double.parseDouble((string));

    }

    public double convertToDouble(boolean bo) {
        System.out.println("введен тип boolean");
        return 0;
    }

    public String converToString(byte b) {
        return String.valueOf(b);
    }

    public String converToString(int i) {
        return String.valueOf(i);
    }

    public int converToString(long l) {
        return (int) l;
    }

    public String converToString(char c) {
        return String.valueOf(c);
    }

    public String converToString(float f) {
        return String.valueOf((int) f);
    }

    public String converToString(double d) {
        return String.valueOf((int) d);
    }

    public String converToString(String string) {
        return string;
    }

    public String converToString(boolean boo) {
        System.out.println("введен тип boolean");
        return String.valueOf(0);
    }


    public static void main(String[] args) {

        Converter converter = new Converter("Conv");
        int a = converter.convertToInt(44);
        System.out.println(a);
        converter.converToString(false);

    }}