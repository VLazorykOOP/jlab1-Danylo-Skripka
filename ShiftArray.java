import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 3;

        // Циклічний зсув масиву на k позицій вправо
        for (int i = 0; i < k; i++) {
            // Останній елемент масиву переносимо на перше місце
            int lastElement = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            // Останній елемент записуємо в кінець масиву
            array[0] = lastElement;
        }

        // Виведення масиву після зсуву
        System.out.println(Arrays.toString(array));
    }
}
