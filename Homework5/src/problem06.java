import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers you want in array?");
        int n = scanner.nextInt();
        int [] array = new int[n];
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.println("input elements for array");
            array [i] = scanner.nextInt();
        }
        int minValue = array [0];
        int maxValue = array [n-1];
        for (i = 1; i < n; i++) {
            if (array [i] < minValue) {
                minValue = array [i];
            }
        }
        for (i = 0; i < n-1; i++) {
            if (array [i] > maxValue) {
                maxValue = array [i];
            }
        }
        System.out.println("minValue is " + minValue);
        System.out.println("maxValue is " + maxValue);
    }
}
