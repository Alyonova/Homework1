package HW9;


public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Kira", "Korova", 1987);
        Human father = new Human("David", "Korova", 1987);
        Human child = new Human("Mia", "Korova", 2005);
        Human child2 = new Human("Lia", "Korova", 2020);
        Family family = new Family("Korova", mother, father);
        family.addChild(child);
        child.setFamily(family);
        child2.setFamily(family);
        child2.setMother(mother);
        child2.setFather(father);
        family.addChild(child2);
        Pet dog = new Pet("dog", "Jerry", 1, new String[]{"істи, пити"});

        Human father2 = new Human("John", "Ivanov", 1990);
        Human mother2 = new Human("Eva", "Ivanov", 1990);

        Human mother3 = new Human("Jane", "Petrov", 1974);
        Human father3 = new Human("John", "Petrov", 1965);

        Family Petrov = new Family("Petrov", mother3, father3);
        Petrov.setMother(mother3);
        Petrov.setFather(father3);
        Family Ivanov = new Family("Ivanov", mother2, father2);

        Pet pet2 = new Pet("cat", "Lee", 12, new String[]{"drink", "eat", "play"});
        Pet pet3 = new Pet("fish", "Flounder", 9, new String[]{"swim", "eat"});
        family.setPet(dog);
        Petrov.setPet(pet2);
       Ivanov.setPet(pet3);
       child.setFather(father);
       child.setMother(mother);
        System.out.println(family);
        child2.setPet(dog);
        child2.describePet();
        System.out.println(mother);
        System.out.println(child2);
        child.greetPet();
        child2.greetPet();
        System.out.println(Petrov.countFamily());
        Petrov.setPet(pet2);
        mother3.setPet(pet2);
        mother3.describePet();
        System.out.println(Petrov);
        mother2.greetPet();
        System.out.println(Ivanov.countFamily());
        System.out.println(Ivanov);
    }
}
