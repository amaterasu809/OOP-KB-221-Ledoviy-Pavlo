public class task11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumOfEven = sum(array);
        System.out.println("Сума парних чисел у масиві: " + sumOfEven);
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }
}

