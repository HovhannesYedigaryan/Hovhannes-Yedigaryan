import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array");
        int n = scanner.nextInt();
        int [] array = new int[n];
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.println("Input element " + i);
            int a = scanner.nextInt();
            array [i] = a;
        }
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
