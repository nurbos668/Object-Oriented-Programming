package problem5.copy;

public class Main {
    public static void main(String[] args) {
        // Create registry
        PersonRegistry registry = new PersonRegistry();
        
        // Create people
        Person adil = new Employee("Adil", 30, "Engineer");
        Person akhmet = new PhDStudent("Akhmet", 26, "AI");
        Person doni = new Student("Doni", 22, "Biology");
        Person adam = new Student("Adam", 19, "Math");
        
        // Create animals
        Animal harbi = new Cat("Harbi", 5, "White");
        Animal aqtos = new Dog("Aqtos", 3, "Alabai");
        Animal kiki = new Bird("Kiki", 1);
        Animal gold = new Fish("Gold", 2);
        
        // Add people to registry
        registry.addPerson(adil);
        registry.addPerson(akhmet);
        registry.addPerson(doni);
        registry.addPerson(adam);

        adil.assignPet(harbi);
        akhmet.assignPet(aqtos);
        doni.assignPet(kiki);
        akhmet.assignPet(gold);
        
        System.out.println("\n    Registry   ");
        registry.printAll();
        
        System.out.println("\n    Before vacation    ");
        adil.leavePetWith(adam);
        
        System.out.println("\n    During  vacation   ");
        registry.printAll();
        
        akhmet.assignPet(aqtos); 
        
        System.out.println("\n    After vacation   ");
        adil.retrievePet(doni);
        adil.retrievePet(adam);
        registry.printAll();

        System.out.println("\n    People with pets    ");
        for (Person p : registry.getPeopleWithPets()) {
            System.out.println(p.getName());
        }
        
        System.out.println("\n    People without pets    ");
        for (Person p : registry.getPeopleWithoutPets()) {
            System.out.println(p.getName());
        }
    }
}