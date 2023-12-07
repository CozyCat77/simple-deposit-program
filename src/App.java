import java.util.*;
public class App {
    // public static double balance = 10;
    public static void main(String[] args) throws Exception {
        // program allow user to make deposit, withdrawal or check balance
        // double amount = 0;
        // init scanner object 
        double balance = 1000;
        boolean flag = true;
        // main loop ask user input 
        while (flag) {
            Scanner console = new Scanner(System.in);
            double amount = 0;
            printMenu();
            try {
                int choice = console.nextInt();
                if (choice == 1) {
                    showBalance(balance);
                } else if (choice == 2) {
                    System.out.println("enter amount to deposit: ");
                    amount = console.nextDouble();
                    if(deposit(amount, balance) != 0) {
                        balance = deposit(amount, balance);
                    } else {
                        System.out.println("something went wrong...");
                    }
                } else if (choice == 3) {
                    System.out.println("enter amount to withdrwal: ");
                    amount = console.nextDouble();
                    if (withdrawal(balance, amount) != 0) {
                        balance = withdrawal(balance, amount);
                    } else {
                        System.out.println("something went wrong...");
                    }
                } else if (choice == 4) {
                    System.out.println("program end");
                    flag = false;
                } 
            } catch(InputMismatchException e) {
                System.out.println("plese enter the number shown on screen");
            } catch(Exception e) {
                System.out.println("something went wrong");
            }
            
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

    // add deposit, withdrawal and showBalance functions
    static void showBalance(double balance) {
        System.out.println(balance);
    }

    static double deposit(double amount, double balance) {
        if (amount > 0) {
            return balance += amount;
        } else {
            return 0;
        }
    }

    static double withdrawal(double balance, double amount) {
        if (balance > amount && amount > 0) {
            return balance -= amount;
        } else {
            return 0;
        }
    }
}