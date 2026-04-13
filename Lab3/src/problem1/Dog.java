package problem1;

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }

    @Override
    public void speak() { System.out.println(name + " says: Woof!"); }
}
