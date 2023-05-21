package com.gmail.zavsek_o2;

import java.util.Random;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків M: ");
        int m = scanner.nextInt();

        System.out.print("Введіть кількість стовпців N: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        int[][] transposedMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Матриця M x N:");
        printMatrix(matrix);

        System.out.println("Транспонована матриця N x M:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}