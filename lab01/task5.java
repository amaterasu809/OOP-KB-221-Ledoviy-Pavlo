import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть висоту, на яку равлик піднімається за день:");
        int a = scanner.nextInt();
        System.out.println("Введіть висоту, на яку равлик сповзає за ніч:");
        int b = scanner.nextInt();
        System.out.println("Введіть висоту дерева:");
        int h = scanner.nextInt();

        int days = (h - b + (a - b) - 1) / (a - b);
        if (days < 0) {
            System.out.println("Impossible");
        } else {
            System.out.println(days);
        }
    }
}
