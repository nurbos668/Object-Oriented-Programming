package problem3;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.getStatistics(new LogicGame());
        app.getStatistics(new MemoryGame());

        IPhone phone = new IPhone();
        phone.sell();
        phone.plug();
    }
}