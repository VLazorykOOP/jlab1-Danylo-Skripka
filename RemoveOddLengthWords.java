import java.util.Scanner;

class RemoveOddLengthWords {

    public static void main(String[] args) {
        // Створення сканера
        try (Scanner scanner = new Scanner(System.in)) {

            // Введення тексту
            System.out.println("Введіть текст:");
            String text = scanner.nextLine();

            // Створення результуючого тексту
            StringBuilder result = new StringBuilder();

            // Перебір слів у тексті
            for (String word : text.split(" ")) {
                // Якщо довжина слова парна, то додати його до результуючого тексту
                if (word.length() % 2 == 0) {
                    result.append(word).append(" ");
                }
            }

            // Виведення результуючого тексту
            System.out.println("Текст без непарних слів:");
            System.out.println(result.toString());
        }
    }
}
