package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = random.ints(10, 0, 100).toArray(); // Масив з 10 випадкових чисел від 0 до 100
        System.out.println("Початковий масив: " + Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        int target = array[random.nextInt(array.length)];
        int result = ArrayUtils.binarySearch(array, target);
        if (result != -1) {
            System.out.println("Значення " + target + " знайдено на індексі: " + result);
        } else {
            System.out.println("Значення " + target + " не знайдено.");
        }
    }
}