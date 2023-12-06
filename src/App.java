import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // program allow user to make deposit, withdrawal or check balance
        double balance = 0; 
        // double amount = 0;
        // init scanner object 
        Scanner console = new Scanner(System.in);
        boolean flag = true;
        // ask user input 
        while (flag) {
            printMenu();
            int choice = console.nextInt();
            double res = choice(choice, console, balance);
            System.out.println(res);
        }
    }

    // break down the operations into functions 
    static void printMenu() {
            // ask user options
        System.out.println("1. view balance.");
        System.out.println("2. deposit");
        System.out.println("3. withdrawal");
        System.out.println("4. quit program");
        System.out.print("Enter a number to continue: ");        
    }

    // take the choice switch statement into a function.
    static double choice(int choice, Scanner console, double balance) {
        double amount = 0;
        switch(choice) {
                case 1:
                    // System.out.println("current balance: " + balance + "\n");
                    return balance;
                case 2:
                    System.out.println("Enter amount to deposit: \n");
                    amount = console.nextDouble();
                    if (amount > 0) {
                        return balance += amount;
                    } else {
                        // System.out.println("deposit amount must be greater than 0");
                        return -2.0;
                    }
                    // break;
                case 3:
                    System.out.println("Enter amount to withdrawal: \n");
                    amount = console.nextDouble();
                    if (balance > amount && balance > 0) {
                        return balance -= amount;
                    } else {
                        // System.out.println("withdrwal amount must be less than balance and greater than 0");
                        return -3;
                    }
                    // break;
                case 4:
                    System.out.println("program end");
                    console.close();
                    return -4;
                    // flag = -1;
                default:
                    return 404;
            }

    }
}