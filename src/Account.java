public class Account {
    // attributes for deposit account
    // username
    // balance
    // password
    // contact
    private String username;
    private double balance;
    private String contact;
    private String password;

    // add constructor 
    public Account(String username, double balance, String password, String contact) {
        this.username = username;
        this.balance = balance;
        this.password = password;
        this.contact = contact;
    }

    // getter 
    public String getName() {return username;}
    public String getContact() {return contact;}
    public double getBalance() {return balance;}
    public String getPassword() {return password;}
    // setter
    public void setName(String name) {this.username = name;}
    public void setContact(String contact) {this.contact = contact;}
    public void setPassword(String password) {this.password = password;}
    public void setBalance(double balance) {this.balance += balance;}
    void login() {System.out.println("account login");}
    void register() {System.out.println("account register");}

}
