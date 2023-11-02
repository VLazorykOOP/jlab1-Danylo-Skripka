public class Matrix2x2 {
    private double[][] data = new double[2][2];

    public Matrix2x2(double a, double b, double c, double d) {
        data[0][0] = a;
        data[0][1] = b;
        data[1][0] = c;
        data[1][1] = d;
    }

    public double getDeterminant() {
        return data[0][0] * data[1][1] - data[0][1] * data[1][0];
    }

    public Matrix2x2 getInverse() {
        double det = getDeterminant();
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is not invertible");
        }

        double invDet = 1.0 / det;
        double a = data[1][1] * invDet;
        double b = -data[0][1] * invDet;
        double c = -data[1][0] * invDet;
        double d = data[0][0] * invDet;

        return new Matrix2x2(a, b, c, d);
    }

    public Matrix2x2 multiply(Matrix2x2 other) {
        double a = data[0][0] * other.data[0][0] + data[0][1] * other.data[1][0];
        double b = data[0][0] * other.data[0][1] + data[0][1] * other.data[1][1];
        double c = data[1][0] * other.data[0][0] + data[1][1] * other.data[1][0];
        double d = data[1][0] * other.data[0][1] + data[1][1] * other.data[1][1];

        return new Matrix2x2(a, b, c, d);
    }

    public Matrix2x2 add(Matrix2x2 other) {
        double a = data[0][0] + other.data[0][0];
        double b = data[0][1] + other.data[0][1];
        double c = data[1][0] + other.data[1][0];
        double d = data[1][1] + other.data[1][1];

        return new Matrix2x2(a, b, c, d);
    }

    public Matrix2x2 multiplyByScalar(double scalar) {
        double a = data[0][0] * scalar;
        double b = data[0][1] * scalar;
        double c = data[1][0] * scalar;
        double d = data[1][1] * scalar;

        return new Matrix2x2(a, b, c, d);
    }

    @Override
    public String toString() {
        return String.format("[%.2f, %.2f]\n[%.2f, %.2f]", data[0][0], data[0][1], data[1][0], data[1][1]);
    }

    public static void main(String[] args) {
        Matrix2x2 matrix1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 matrix2 = new Matrix2x2(5, 6, 7, 8);

        System.out.println("Matrix1:");
        System.out.println(matrix1);

        System.out.println("Matrix2:");
        System.out.println(matrix2);

        System.out.println("Determinant of Matrix1: " + matrix1.getDeterminant());

        Matrix2x2 inverseMatrix1 = matrix1.getInverse();
        System.out.println("Inverse of Matrix1:");
        System.out.println(inverseMatrix1);

        Matrix2x2 product = matrix1.multiply(matrix2);
        System.out.println("Matrix1 * Matrix2:");
        System.out.println(product);

        Matrix2x2 sum = matrix1.add(matrix2);
        System.out.println("Matrix1 + Matrix2:");
        System.out.println(sum);

        Matrix2x2 scaledMatrix = matrix1.multiplyByScalar(2.5);
        System.out.println("Matrix1 * 2.5:");
        System.out.println(scaledMatrix);
    }
}
