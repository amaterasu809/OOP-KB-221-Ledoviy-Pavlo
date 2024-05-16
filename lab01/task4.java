import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Скільки незнайомців ви збираєтеся зустріти?");
        int numOfStrangers = scanner.nextInt();

        if (numOfStrangers <= 0) {
            System.out.println("Неприпустиме значення для кількості незнайомців.");
            return;
        }

        scanner.nextLine();
        for (int i = 1; i <= numOfStrangers; i++) {
            System.out.println("Введіть ім'я незнайомця " + i + ":");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
        }
    }
}