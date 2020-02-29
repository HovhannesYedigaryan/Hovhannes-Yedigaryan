import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
        }
    }

