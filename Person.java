public class Person {
    public String name;
    public int balance;
    public Company company;

    public Person() {
    }

    public Person(String name, int balance, Company company){
        this.name = name;
        this.balance = balance;
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public Company getCompany() {
        return company;
    }

    public void Transfer(Person person2, int amount) {
      person2.getMoney(amount);
    }

    public void sendMoney(int amount) {
        balance = balance - amount;
    }

    public void getMoney(int amount) {
        balance = balance + amount;
    }
}
