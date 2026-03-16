package problem3.copy;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        System.out.println("--- Opening accounts ---");
        
        int acc1 = bank.openAcc("checking", 1000.0, 0.0);
        int acc2 = bank.openAcc("savings", 5000.0, 2.5);
        int acc3 = bank.openAcc("checking", 250.0, 0.0);
        int acc4 = bank.openAcc("savings", 10000.0, 5.0);
        int acc5 = bank.openAcc(" ", 50.0, 0.0);
        int acc6 = bank.openAcc(" ");
        
        System.out.println("\n--- Perform transactions ---");
        
        Account checking1 = bank.getAcc(acc1);
        Account savings1 = bank.getAcc(acc2);
        Account checking2 = bank.getAcc(acc3);
        Account savings2 = bank.getAcc(acc4);
        
        if (checking1 != null) {
            checking1.deposit(200);
            checking1.withdraw(50);
            checking1.deposit(100);
            checking1.withdraw(75);
            checking1.withdraw(25);
            checking1.deposit(300); 
        }
        
        if (savings1 != null) {
            savings1.deposit(1000);
            savings1.withdraw(500);
        }
        
        if (checking2 != null) {
            checking2.deposit(100);
            checking2.withdraw(50);
        }
        
        if (savings2 != null) {
            savings2.transfer(2000, checking1);
        }
        
        System.out.println("\n--- Before update ---");
        bank.printAllAcc();
        
        System.out.println("\n--- Updating... ---");
        bank.update();
        
        System.out.println("\n--- After update ---");
        bank.printAllAcc();
        
        System.out.println("\n--- Closing account ---");
        bank.closeAcc(acc5);
        bank.closeAcc(acc6);
        
        System.out.println("\n--- Final result ---");
        bank.printAllAcc();
    }
}