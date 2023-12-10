import java.util.*;
public class App {
    // public static double balance = 10;
    public static void main(String[] args) throws Exception {
        // create account object 
        Scanner console = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<Account>();
        boolean flag = true;
        while(flag) {
            homePageMenu();
            int userInput = console.nextInt();
            if (userInput == 1) {
                Account user = new Account(null, 0, null, null, null);
                createAccount(console, user);
                accounts.add(user);
                
            } else if (userInput == 2) {

            } else if(userInput == 3) {
                flag = false;
            } else if(userInput == 4) {
                for(Object obj : accounts) {
                    System.out.println(obj.toString());
                }
            }
        }
    }
    static void homePageMenu() {
        System.out.println("1. Create account.");
        System.out.println("2. Login");
        System.out.println("3. quit system");
        System.out.println("4 dispaly all accounts");
    }

    static void createAccount(Scanner console, Account user) {
        // set name
        System.out.println("Enter your name: ");
        String name = console.next();
        user.setName(name);
        // set gender
        System.out.println("Enter your gender: ");
        String gender = console.next();
        user.setGender(gender);
        // set email 
        System.out.println("Enter your contact (email)");
        String email = console.next();
        user.setContact(email);
        // set password 
        System.out.println("Enter your password");
        String password = console.next();
        user.setPassword(password);
        // set default balance
        System.out.println("Enter your balance");
        double balance = console.nextDouble();
        user.setBalance(balance);
        // output info for confirmation 
        System.out.println("================ confirm information ================");
        System.out.println(user.toString());
        System.out.println("=====================================================");
    }

    static void isUniqueUserName(ArrayList<Account> accounts) {

    }
}