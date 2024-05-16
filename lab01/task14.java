public class task14 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 7, 4};
        int[] array2 = {1, 3, 2, 7, 4};

        cycleSwap(array1);
        System.out.println("Результат cycleSwap для зсуву на 1 позицію: " + arrayToString(array1));

        cycleSwap(array2, 3);
        System.out.println("Результат cycleSwap з вказаним зсувом: " + arrayToString(array2));
    }

    public static void cycleSwap(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    public static void cycleSwap(int[] array, int shift) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[(i + shift) % array.length] = array[i];
        }
        System.arraycopy(temp, 0, array, 0, array.length);
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

