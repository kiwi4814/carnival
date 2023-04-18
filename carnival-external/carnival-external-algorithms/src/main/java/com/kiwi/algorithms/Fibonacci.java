package com.kiwi.algorithms;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiRecursion(28)); // 317811
        System.out.println(fiLoop(28)); // 317811
        System.out.println(fibonacci(28)); // 317811
    }

    /**
     * 使用递归
     */
    private static int fiRecursion(int n) {
        if (n <= 1) return n;
        return fiRecursion(n - 2) + fiRecursion(n - 1);
    }

    /**
     * 使用循环
     */
    private static int fiLoop(int n) {
        if (n <= 1) return n;
        int f1 = 0;
        int f2 = 1;
        for (int i = 2; i <= n; i++) {
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        return f2;
    }

    /**
     * 使用二维矩阵
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        }
        if (n == 0) {
            return 0;
        }
        int[][] matrix = {{1, 1}, {1, 0}};
        int[][] result = matrixPower(matrix, n - 1);
        return result[0][0];
    }

    private static int[][] matrixPower(int[][] matrix, int n) {
        int[][] result = {{1, 0}, {0, 1}};
        while (n > 0) {
            if (n % 2 == 1) {
                result = matrixMultiply(result, matrix);
            }
            matrix = matrixMultiply(matrix, matrix);
            n /= 2;
        }
        return result;
    }

    private static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[2][2];
        result[0][0] = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
        result[0][1] = matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1];
        result[1][0] = matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
        result[1][1] = matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];
        return result;
    }

}
