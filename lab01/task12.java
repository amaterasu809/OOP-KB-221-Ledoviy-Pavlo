import java.util.Arrays;

public class task12 {
    public static void main(String[] args) {
        int[] inputArray = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] resultArray = getSumCheckArray(inputArray);
        System.out.println("Результат: " + Arrays.toString(resultArray));
    }

    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] result = new boolean[arr.length];
        result[0] = false;
        result[1] = false;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + arr[i - 2]) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }
}
