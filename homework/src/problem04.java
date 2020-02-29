public class problem04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        while  (a < 12 || b < 8) {
            System.out.print(a + " : " + b);
            a = a * 2;
            b = b + 1;
        }
    }
}
