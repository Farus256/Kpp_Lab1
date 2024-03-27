package kpp_lab1;

import java.util.Random;

public class Matrix {
    private double[][] matrix;
    private int n;

    public Matrix(int n) {
        this.n = n;
        this.matrix = new double[n][n];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void generateMatrix() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
        }
        printMatrix("Сгенерированная матрица");
    }

    public void subtractAverage() {
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            double average = sum / n;
            for (int j = 0; j < n; j++) {
                matrix[i][j] -= average;
            }
        }
        printMatrix("Матрица после деления на среднее");
    }

    public void printMatrix(String title) {
        System.out.println(title + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}