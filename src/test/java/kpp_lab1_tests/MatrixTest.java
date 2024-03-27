package kpp_lab1_tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import kpp_lab1.Matrix;
public class MatrixTest {
    @Test
    public void testMatrix() {
        int n = 3;
        Matrix matrix = new Matrix(n);
        matrix.generateMatrix();
        // Проверяем, что матрица была создана
        assertNotNull(matrix);
        // Проверяем, что матрица имеет правильный размер
        assertEquals(n, matrix.getMatrix().length);
        assertEquals(n, matrix.getMatrix()[0].length);
        // Проверяем, что все элементы матрицы находятся в диапазоне от -n до n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                assertTrue(matrix.getMatrix()[i][j] >= -n && matrix.getMatrix()[i][j] <= n);
            }
        }
        matrix.subtractAverage();
        // Проверяем, что после вычитания среднего арифметического каждой строки сумма элементов каждой строки близка к 0
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix.getMatrix()[i][j];
            }
            assertTrue(Math.abs(sum) < 0.0001);
        }
    }
}
