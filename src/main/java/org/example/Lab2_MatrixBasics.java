package org.example;

import java.util.Random;
import java.util.Scanner;

public class Lab2_MatrixBasics {
    private static final int MIN_RANDOM = -50;
    private static final int MAX_RANDOM = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Лабораторна робота №2: Основи Java ===");
        System.out.print("Введіть кількість рядків (макс. 20): ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (макс. 20): ");
        int cols = scanner.nextInt();

        if (rows > 20 || cols > 20 || rows <= 0 || cols <= 0) {
            System.out.println("❌ Розмір матриці некоректний!");
            return;
        }

        System.out.print("Оберіть спосіб створення матриці (1 - ручне введення, 2 - випадкове заповнення): ");
        int choice = scanner.nextInt();

        int[][] matrix;
        if (choice == 1) {
            matrix = manualMatrixInput(scanner, rows, cols);
        } else if (choice == 2) {
            matrix = randomMatrix(rows, cols);
        } else {
            System.out.println("❌ Невірний вибір!");
            return;
        }

        System.out.println("\nМатриця:");
        printMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double avg = calculateAverage(matrix);
        double geometricMean = calculateGeometricMean(matrix);

        System.out.println("\nМінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + avg);
        System.out.println("Середнє геометричне: " + geometricMean);

        scanner.close();
    }

    private static int[][] manualMatrixInput(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] randomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%6d", value);
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) min = value;
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) max = value;
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    // Розрахунок середнього геометричного елементів матриці
    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > 0) { // геометричне визначене тільки для додатних чисел
                    product *= value;
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("⚠️ Неможливо обчислити середнє геометричне — у матриці немає додатних елементів.");
            return 0;
        }

        return Math.pow(product, 1.0 / count);
    }
}
