public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Apple");
        Company company2 = new Company("Grand Candy");
        Person person1 = new Person("Alex", 1000, company1);
        Person person2 = new Person("Erica", 1300, company1);
        Person person3 = new Person("Mickey", 800, company1);
        Person person4 = new Person("Andranik", 120, company2);
        Person person5 = new Person("Anahit", 95, company2);
        Person person6 = new Person("Vache", 150, company2);

        System.out.println(person1.getName() + " " + person1.getBalance() + " " + company1.getCompanyName());
        System.out.println(person2.getName() + " " + person2.getBalance() + " " + company1.getCompanyName());
        System.out.println(person3.getName() + " " + person3.getBalance() + " " + company1.getCompanyName());
        System.out.println(person4.getName() + " " + person4.getBalance() + " " + company2.getCompanyName());
        System.out.println(person5.getName() + " " + person5.getBalance() + " " + company2.getCompanyName());
        System.out.println(person6.getName() + " " + person6.getBalance() + " " + company2.getCompanyName());

        Company[] arrarCompany = new Company[2];
        arrarCompany[0] = company1;
        arrarCompany[1] = company2;

        Person[] arrayaPerson = new Person[6];
        arrayaPerson[0] = person1;
        arrayaPerson[1] = person2;
        arrayaPerson[2] = person3;
        arrayaPerson[3] = person4;
        arrayaPerson[4] = person5;
        arrayaPerson[5] = person6;


        person1.Transfer(person2, 13);
        System.out.println(person1.getBalance());
        System.out.println(person2.getBalance());

        Person rich = new Person();
        int maxBalance = 0;
        for (int i = 0; i < arrayaPerson.length; i++) {
            arrayaPerson[i].getBalance();
            if (maxBalance < arrayaPerson[i].getBalance()) {
                maxBalance = arrayaPerson[i].getBalance();
                rich = arrayaPerson[i];
            }
        }
        System.out.println("rich is a" + " " + rich.getName());

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arrayaPerson.length; i++) {
            arrayaPerson[i].getCompany();
            if (arrayaPerson[i].getCompany() == company1) {
                sum1 = sum1 + arrayaPerson[i].getBalance();
            }
            else {
                sum2 = sum2 + arrayaPerson[i].getBalance();
            }
        }
        if (sum1 > sum2) {
            System.out.println("rich compani is a " + company1.getCompanyName());
        }
        else {
            System.out.println("rich compani is a " + company2.getCompanyName());
        }
    }
}
