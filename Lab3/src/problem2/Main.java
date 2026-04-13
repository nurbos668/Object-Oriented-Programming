package problem2;

public class Main {
 public static void main(String[] args) {

     Lion athlete = new Lion("symba");
     athlete.move();
     athlete.run();

     System.out.println("---");

     Eagle eagle = new Eagle();
     eagle.move();
     eagle.fly();

     System.out.println("---");

     Superman superman = new Superman();
     superman.move();
     superman.run();
     superman.fly();
 }
}