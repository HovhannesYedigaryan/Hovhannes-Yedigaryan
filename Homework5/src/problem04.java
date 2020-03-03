import java.util.Scanner;

public class problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input four numbers for arrayA");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arrayA = new int[4];
        int[] arrayB = new int[4];
        arrayB[0] = 20;
        arrayB[1] = 13;
        arrayB[2] = -9;
        arrayB[3] = 73;
        arrayA[0] = a;
        arrayA[1] = b;
        arrayA[2] = c;
        arrayA[3] = d;
        a = arrayB[0];
        b = arrayB[1];
        c = arrayB[2];
        d = arrayB[3];
        for (int anArray : arrayB) {
            System.out.print(anArray + " ");
        }
    }
}
