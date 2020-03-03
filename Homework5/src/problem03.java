import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a symbol");
        String symbol = scanner.nextLine();
        String[] array = {"a", "p", "p", "l", "e"};
        int n = 5;
        int i = 0;
        boolean resoult = (symbol.equals(array[i]));
        for (i = 0; i < 5; i++) {
            resoult = (symbol.equals(array[i]));
            if (resoult == true) {
                break;
            } else {
                continue;
            }
        }
        if (resoult) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        }
        }


