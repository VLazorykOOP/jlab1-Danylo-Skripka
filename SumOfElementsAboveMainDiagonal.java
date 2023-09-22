import java.util.Scanner;

public class SumOfElementsAboveMainDiagonal {

    public static void main(String[] args) {
        // Створення сканера
        try (Scanner scanner = new Scanner(System.in)) {

            // Введення розміру матриці
            System.out.print("Введіть розмір матриці: ");
            int n = scanner.nextInt();

            // Створення матриці
            double[][] A = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = scanner.nextDouble();
                }
            }

            // Обчислення суми елементів
            double sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (A[i][j] > A[i][j + 1]) {
                        sum += A[i][j];
                    }
                }
            }

            // Виведення результату
            System.out.println("Сума елементів: " + sum);
        }
    }
}
