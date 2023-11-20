package HW9;

import java.util.Arrays;
import java.util.Random;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    public int trickLevel = new Random().nextInt(100);

    private String[] habits;

    public Pet(String species, String nickname, int i, int i1, String[] strings) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.habits = habits;
    }

    public Pet() {
    }


    public void eat() {

        System.out.println("Я їм!");
    }

    public void respond(){

        System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!");
    }

    public void foul() {

        System.out.println("Потрібно добре замести сліди...");
    }
    public String getSpecies() {

        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHabits() {

        return habits;
    }

    public void setHabits(String[] habits) {

        this.habits = habits;
    }
    @Override
    public String toString() {
        return "Я " + species + ". " + "Мене звати " + nickname + ", мені " + age + " років"
+                ", trickLevel=" + trickLevel + ", я вмію" + Arrays.toString(habits);
    }
}


