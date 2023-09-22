import java.util.Scanner;

public class Expression {

    public static void main(String[] args) {
        // Створення сканера
        try (Scanner scanner = new Scanner(System.in)) {

            // Введення значень x і y
            System.out.print("Введіть значення x: ");
            int x = scanner.nextInt();

            System.out.print("Введіть значення y: ");
            int y = scanner.nextInt();

            // Визначення типу вхідних даних
            Type type = x > y ? Type.DOUBLE : Type.INT;

            // Обчислення значення виразу
            double value = calculate(x, y, type);

            // Виведення результату
            System.out.println("Значення виразу: " + value);
        }
    }

    private static double calculate(int x, int y, Type type) {
        switch (type) {
            case DOUBLE:
                return 2 * x * x + x * y / (x * y) * x * y + 3 * x * y - y * y * y / x * x + 2 * y * y;
            case INT:
                return 2 * x * x + (double) x * y / ((double) x * y) * (double) x * y + 3 * x * y - (double) y * y * y / x * x + 2 * y * y;
            default:
                throw new IllegalArgumentException("Невідомий тип даних");
        }
    }

    enum Type {
        DOUBLE,
        INT
    }
}
