public class task10 {
    public static void main(String[] args) {
        int[] array = {10, 5, 7, 2, 8};
        int maxValue = max(array);
        System.out.println("Максимальне значення у масиві: " + maxValue);
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
