package problem2;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cat cat = new Cat("Murka", 4);
        Student student = new Student("Nurbo", 18, 346456);

        System.out.println("--- Serving pizza to Cat ---");
        restaurant.servePizza(cat);

        System.out.println("--- Serving pizza to Student ---");
        restaurant.servePizza(student);
    }
}
