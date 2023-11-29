package HW10;

public class Seller {
    private String name;
        private boolean honest;

    public Seller(String name, boolean honest) {
        this.name = name;
        this.honest = honest;
    }

    public String getName() {
        return name;
    }

    public boolean isHonest() {
        return honest;
    }
}
