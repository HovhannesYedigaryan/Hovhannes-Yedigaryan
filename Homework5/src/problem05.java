import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a symbol");
        char symbol = scanner.next().charAt(0);
        char[] array =new char[10];
        array [0] = 'm';
        array [1] = 'a';
        array [2] = 'd';
        array [3] = 'a';
        array [4] = 'g';
        array [5] = 'a';
        array [6] = 's';
        array [7] = 'k';
        array [8] = 'a';
        array [9] = 'r';
        int sum = 0;
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (symbol == array[i]) {
                sum = sum + 1;
            } else {
                continue;
            }
        }
        System.out.println(sum);
        }

    }
