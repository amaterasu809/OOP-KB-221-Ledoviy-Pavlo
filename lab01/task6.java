import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть загальну суму рахунку:");
        double totalBill = scanner.nextDouble();
        System.out.println("Введіть кількість друзів:");
        int numOfFriends = scanner.nextInt();

        if (totalBill <= 0 || numOfFriends <= 0) {
            System.out.println("Неприпустимі значення для суми рахунку або кількості друзів.");
            return;
        }

        double perFriendPayment = (totalBill * 1.1) / numOfFriends;

        System.out.println("Розмір частини оплати на кожного друга: " + perFriendPayment);
    }
}

