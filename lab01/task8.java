import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Введіть послідовність цілих чисел, які розділені пробілами:");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Середнє значення: " + average);
    }
}

