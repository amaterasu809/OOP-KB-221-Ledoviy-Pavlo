import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task13 {
    public static void main(String[] args) {
        int[] inputArray = {18, 1, 3, 6, 7, -5};
        int[] resultArray = removeLocalMaxima(inputArray);
        System.out.println("Результат виконання: " + Arrays.toString(resultArray));
    }

    public static int[] removeLocalMaxima(int[] arr) {
        List<Integer> resultList = new ArrayList<>();

        resultList.add(arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
                resultList.add(arr[i]);
            }
        }

        resultList.add(arr[arr.length - 1]);

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}

