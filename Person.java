public class Person extends Company {
    public String name;
    public int balance;

    public Person(String name, int balance, String companyName) {
        super(companyName);
        this. name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
