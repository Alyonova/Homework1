package HW9;

import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq = new Random().nextInt(80, 150);
    private Pet pet;
    private Human mother;
    private Human father;
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, Pet pet, Human mother, Human father, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.family = family;
    }

    public Human() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
    public void greetPet () {
        if (pet != null) {
            System.out.println("Привіт, " + pet.getNickname());
        } else {
            System.out.println("В мене немає тварини");
        }
    }
    public void describePet(){
        String smartPet = (pet.trickLevel >  50) ? "дуже хитрий" : "майже не хитрий";
                if (pet != null) {
            System.out.println("У мене є домашня тварина," + pet.getSpecies() + " " + pet.getNickname() + " " + pet.getAge() + " років," + "він " + smartPet);
        } else {
            System.out.println("В мене немає тварини");
    }}

    @Override
    public String toString() {
        if (mother == null && father == null) {
            return name + " " + surname + ", Рік народження: " + year +
                    " " + "iq: " + iq;
        } else {
            return  name + " " + surname + " " + "Рік народження: " + year +
                 " " + "iq: " + iq + " " + "\n" + "мати: "+ getMother() + "\n" + "тато: " + getFather();
    }
    }

}





