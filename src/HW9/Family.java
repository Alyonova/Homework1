package HW9;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class Family {
    private String familyName;

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(String familyName, Human mother, Human father) {
        this.familyName = familyName;
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public int countFamily() {
        return 2 + children.length;
    }

    public void addChild(Human child) {
        child.setFamily(this);
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
    }

    public void deleteChild(int index) {
        children[index].setFamily(null);
        children[index] = null;
        Human[] newArray = new Human[children.length - 1];
        int counter = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                continue;
            }
            children[i] = newArray[counter];
            counter++;
        }
        children = newArray;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(String familyName, Human mother, Human father, Human[] children, Pet pet) {
        this.familyName = familyName;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;

    }
         @Override
        public String toString() {
             if (children.length == 0 && pet == null) {
                 return "Сім'я: " + familyName + mother + father + " " + "Дітей немає " + " " + "Тварин немає";
             } else if (children.length == 0 && pet !=null) {
                 return "Сім'я: " + familyName + " " + mother + " " + father + " " + "Дітей немає " + "Домашня тварина: " + pet.getSpecies();
             } else {
                 return "Сім'я: " + familyName + " " +
                         "мати: " + mother + ", тато: " + father + ", діти:" + Arrays.toString(children) + "Тварина: " + pet.getSpecies();
             }
    }}

