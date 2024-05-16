import java.util.Scanner;

public class task3 {

    private static final int PASSWORD = 123456;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть пароль:");
        int inputPassword = scanner.nextInt();

        if (inputPassword == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}