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
                // ask username and password input 
                String email;
                String password;
                System.out.println("enter your email");
                email = console.next();
                System.out.println("enter your password");
                password = console.next();
                // System.out.println(email + " " + password);
                if(findMatchUserName(accounts, email, password)) {
                    boolean flag01 = true;
                    while(flag01) {
                        userPageMenu();
                    }
                } else {
                    System.out.println("username or password not correct");
                }
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

    static void userPageMenu() {
        System.out.println("1. show balance");
        System.out.println("2. add deposit");
        System.out.println("3. withdrawal");
        System.out.println("4. logout");
    }
    static void createAccount(Scanner console, Account user) {
        // set name
        // System.out.println("Enter your name: ");
        // String name = console.next();
        // user.setName(name);
        // set gender
        // System.out.println("Enter your gender: ");
        // String gender = console.next();
        // user.setGender(gender);
        // set email 
        System.out.println("Enter your contact (email)");
        String email = console.next();
        user.setContact(email);
        // set password 
        System.out.println("Enter your password");
        String password = console.next();
        user.setPassword(password);
        // set default balance
        // System.out.println("Enter your balance");
        // double balance = console.nextDouble();
        // user.setBalance(balance);
        // output info for confirmation 
        System.out.println("================ confirm information ================");
        System.out.println(user.toString());
        System.out.println("=====================================================");
    }

    static Boolean findMatchUserName(ArrayList<Account> accounts, String email, String password) {
        // System.out.println(email + " " + password);
        for (Object obj : accounts) {
            if(((Account) obj).getContact().equals(email) && ((Account) obj).getPassword().equals(password)) {
                return true;
            } 
        }
        return false;
    }
    static void isUniqueUserName(ArrayList<Account> accounts) {

    }
}