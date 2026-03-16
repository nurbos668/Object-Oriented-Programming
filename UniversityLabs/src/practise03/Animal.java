package practise03;

public class Animal {
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String toString() {
        return "Animal: " + name + ", color: " + color;
    }
}
