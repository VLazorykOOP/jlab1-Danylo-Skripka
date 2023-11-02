public class Vector3D {

    private double x;
    private double y;
    private double z;

    // Конструктор за замовчуванням, ініціалізує вектор нульовими координатами
    public Vector3D() {
        this(0.0, 0.0, 0.0);
    }

    // Конструктор для ініціалізації вектора заданими координатами
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Конструктор для створення копії існуючого вектора
    public Vector3D(Vector3D v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }

    // Геттери та сеттери для координат x, y, z
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Статичний метод для додавання двох векторів
    public static Vector3D add(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    // Статичний метод для віднімання одного вектора від іншого
    public static Vector3D subtract(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    // Статичний метод для обчислення скалярного добутку двох векторів
    public static double dotProduct(Vector3D v1, Vector3D v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    // Статичний метод для множення вектора на скаляр
    public static Vector3D multiply(Vector3D v, double k) {
        return new Vector3D(v.x * k, v.y * k, v.z * k);
    }

    // Перевизначений метод equals для порівняння двох векторів
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Vector3D) {
            Vector3D v = (Vector3D) obj;
            return x == v.x && y == v.y && z == v.z;
        }

        return false;
    }

    // Метод для обчислення довжини вектора
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Статичний метод для обчислення довжини вектора
    public static double length(Vector3D v) {
        return Math.sqrt(v.x * v.x + v.y * v.y + v.z * v.z);
    }

    // Перевизначений метод toString для представлення вектора у вигляді рядка
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        // Використання статичних методів для виконання операцій з векторами
        Vector3D v3 = Vector3D.add(v1, v2);
        System.out.println("v1 + v2: " + v3);

        v3 = Vector3D.subtract(v1, v2);
        System.out.println("v1 - v2: " + v3);

        double dot = Vector3D.dotProduct(v1, v2);
        System.out.println("v1 * v2: " + dot);

        v3 = Vector3D.multiply(v1, 2.0);
        System.out.println("2 * v1: " + v3);
    }
}
