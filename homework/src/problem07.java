import java.util.Scanner;
public class problem07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int sum = 1;
            int i = 1;
            do {
                sum = sum + i;
                i = i + 1;
            } while (i <= n);

            System.out.println(sum);
        }
    }
