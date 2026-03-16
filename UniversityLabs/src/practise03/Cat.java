package practise03;

public class Cat extends Animal {
    String breed;

    public Cat(String name, String color, String breed) {
        super(name, color);
        this.breed = breed;
    }

    public void eat() {
        super.eat(); 
        System.out.println(name + " prefers fish!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public String toString() {
        return "Cat: " + name + ", color: " + color + ", breed: " + breed;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers", "white", "Persian");

        System.out.println("-- Override --");
        cat.eat();

        System.out.println("-- Overload --");
        cat.eat("tuna");

        System.out.println("-- toString --");
        System.out.println(cat);
    }
}