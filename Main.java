import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Apple");
        Company company1 = new Company("Grand Candy");
        Object[] arrayCompany = new Object[2];
        arrayCompany [0] = company;
        arrayCompany [1] = company1;
        ArrayList<Object>list = new ArrayList<>();
        Person person1 = new Person("Alex", 300, "Apple");
        Person person2 = new Person("Erica", 500, "Apple");
        Person person3 = new Person("Micky", 1000, "Apple");
        Person person4 = new Person("Andranik", 120, "Grand Cangy");
        Person person5 = new Person("Armen",95, "Grand Cangy");
        Person person6 = new Person("Anahit", 110, "Grand Cangy");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);
        System.out.println(person1.name + " " + person1.balance + " " + person1.getCompanyName());
        System.out.println(person2.name + " " + person2.balance + " " + person2.getCompanyName());
        System.out.println(person3.name + " " + person3.balance + " " + person3.getCompanyName());
        System.out.println(person4.name + " " + person4.balance + " " + person4.getCompanyName());
        System.out.println(person5.name + " " + person5.balance + " " + person5.getCompanyName());
        System.out.println(person6.name + " " + person6.balance + " " + person6.getCompanyName());
    }
}
