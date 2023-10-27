import java.util.Arrays;

public class PracticTest1 {
    public static void main(String[] args) {
        int[] array = {9, 3, 5, 9, 0, 0, 4, 1, 4, 6, 2, 9, 8, 1, 3};
        System.out.println(Arrays.toString(array));
        int count = countDiffNums(array);
        System.out.println("Количество разных чисел в массиве: " + count);
    }

    static int countDiffNums(int[] array) {
        int numbers = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count == 0) {
                numbers++;
            }
        }
        return numbers;
    }
}