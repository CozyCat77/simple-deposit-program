import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // program allow user to make deposit, withdrawal or check balance
        double balance = 0; 
        double amount = 0;
        // init scanner object 
        Scanner console = new Scanner(System.in);
        // git test 
        // git branch test here too
        // add something here
        boolean flag = true;
        // ask user input 
        while (flag) {
            // ask user options
            System.out.println("Enter a number: ");
            System.out.println("1. view balance.");
            System.out.println("2. deposit");
            System.out.println("3. withdrawal");
            System.out.println("4. quit program");
            int choice = console.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("current balance: " + balance + "\n");
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: \n");
                    amount = console.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                    } else {
                        System.out.println("deposit amount must be greater than 0");
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to withdrawal: \n");
                    amount = console.nextDouble();
                    if (balance > amount && balance > 0) {
                        balance -= amount;
                    } else {
                        System.out.println("withdrwal amount must be less than balance and greater than 0");
                    }
                    break;
                case 4:
                    System.out.println("program end");
                    console.close();
                    flag = false;
                    break;
                default:
                    System.out.println("choice not found");
            }
        }
    }
}