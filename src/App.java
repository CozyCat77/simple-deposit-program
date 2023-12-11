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
                // create account
                Account user = new Account(null, 0, null, null, null);
                createAccount(console, user, accounts);
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
                // validate user login
                Account matchUser = findMatchUserName(accounts, email, password);
                if(matchUser != null) {
                    boolean flag01 = true;
                    // main user page 
                    while(flag01) {
                        userPageMenu();
                        int userPageInput = console.nextInt();
                        if (userPageInput == 1) {
                            // show balance 
                            System.out.println(matchUser.getBalance());
                        } else if (userPageInput == 2) {
                            // deposit method 
                            System.out.println("enter amount to deposit");
                            int amount = console.nextInt();
                            // matchUser.setBalance(amount);;
                            if(matchUser.deposit(amount)) {
                                System.out.println("deposit success");
                            } else {
                                System.out.println("deposit failed");
                            }
                        } else if (userPageInput == 3) {
                            // withdrawal method
                            System.out.println("enter amount to withdrwal");
                            int amount = console.nextInt();
                            if(matchUser.withdrawal(amount)) {
                                System.out.println("withdrawal success");
                            } else {
                                System.out.println("withdrawal failed");
                            }
                        } else if(userPageInput == 4) {
                            // log out
                            flag01 = false;
                        }
                    }
                } else {
                    System.out.println("username or password not correct");
                }
            } else if(userInput == 3) {
                // quit program
                flag = false;
            } else if(userInput == 4) {
                for(Object obj : accounts) {
                    // display user info
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
    static void createAccount(Scanner console, Account user, ArrayList<Account> accounts) {
        // set name
        // System.out.println("Enter your name: ");
        // String name = console.next();
        // user.setName(name);
        // set gender
        // System.out.println("Enter your gender: ");
        // String gender = console.next();
        // user.setGender(gender);
        // set email 
        // System.out.println("Enter your contact (email)");
        // String email = console.next();
        boolean Unique = false;
        String email;
        while(!Unique) {
            System.out.println("Enter your contact (email)");
            email = console.next();
            Unique = isUniqueEmail(accounts, email);
            if(Unique) {
                user.setContact(email);
            } else {
                System.out.println("email already in use");
            }
        }
        // set password 
        System.out.println("Enter your password");
        String password = console.next();
        user.setPassword(password);
        // set default balance
        System.out.println("how much would you like to deposit");
        double balance = console.nextDouble();
        user.setBalance(balance);
        // output info for confirmation 
        System.out.println("================ confirm information ================");
        System.out.println(user.toString());
        System.out.println("=====================================================");
    }

    static Account findMatchUserName(ArrayList<Account> accounts, String email, String password) {
        // System.out.println(email + " " + password);
        for (Object obj : accounts) {
            if(((Account) obj).getContact().equals(email) && ((Account) obj).getPassword().equals(password)) {
                return ((Account) obj);
            } 
        }
        return ((Account) null);
    }

    static boolean isUniqueEmail(ArrayList<Account> accounts, String email) {
        
        if(accounts.isEmpty()) {
            return true;
        } else {
            // check if email already exist
            for (Object obj : accounts) {
                if(((Account) obj).getContact().equals(email)) {
                    return false;
                }
            }
        }
        return true;
    }
}