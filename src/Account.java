public class Account {
    // static method and property 
    static {

    }
    // attributes for deposit account
    // username
    // balance
    // password
    // contact
    private String username;
    private double balance=0.0;
    private String contact;
    private String password;
    private String gender;
    // add constructor 
    public Account(String username, double balance, String password, String contact, String gender) {
        this.username = username;
        this.balance = balance;
        this.password = password;
        this.contact = contact;
        this.gender = gender;
    }

    // getter 
    public String getName() {return username;}
    public String getContact() {return contact;}
    public double getBalance() {return balance;}
    public String getPassword() {return password;}
    public String getGender() {return gender;}
    // setter
    public void setName(String name) {this.username = name;}
    public void setContact(String contact) {this.contact = contact;}
    public void setPassword(String password) {this.password = password;}
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // deposit 
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }
    // withdrwal
    public boolean withdrawal(double amount) {
        if (this.balance > amount && amount > 0) {
            this.balance -= amount;
            return true;
        } return false;
    }
    public void setGender(String gender) {this.gender = gender;};

    // toString 
    public String toString() {
        return "\n" + "Username: " + this.username + "\n" + "contact: " + this.contact + "\n" +"gender: " + this.gender 
        + "\n" + "balance: " + this.balance + "\n";
    }
    // boolean login() {return true;}
    // boolean register() {return true;}

}
