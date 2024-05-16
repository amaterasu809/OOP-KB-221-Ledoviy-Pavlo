import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        System.out.println("Введіть послідовність цілих чисел, які розділені пробілами:");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Максимальне значення: " + max);
    }
}
