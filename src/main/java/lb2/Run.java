package lb2;

import java.util.Scanner;

public class Run {
    static int enterNumber() {
        Scanner enterNumber = new Scanner(System.in);
        return enterNumber.nextInt();
    }

    static int[][] createRandomMatrix(int numberOfRows, int numberOfColumns) {
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = (int) (Math.random() * 301);
            }
        }
        return matrix;
    }

    static int[][] createMatrixYourself(int numberOfRows, int numberOfColumns) {
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = enterNumber();
                while (true) {
                    if ((matrix[i][j] > 300) || (matrix[i][j] < 0)) {
                        System.out.println("Entered number is outside of [0;300]!");
                        System.out.println("Enter a new number:");
                        matrix[i][j] = enterNumber();
                    } else break;
                }
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix, int numberOfRows, int numberOfColumns) {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.println("[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }

    static int findMinimalMatrixElement(int[][] matrix, int numberOfRows, int numberOfColumns) {
        int minMatrixElem = matrix[0][0];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (minMatrixElem > matrix[i][j]) {
                    minMatrixElem = matrix[i][j];
                }
            }
        }
        return minMatrixElem;
    }

    static int findMaximalMatrixElement(int[][] matrix, int numberOfRows, int numberOfColumns) {
        int maxMatrixElem = matrix[0][0];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (maxMatrixElem < matrix[i][j]) {
                    maxMatrixElem = matrix[i][j];
                }
            }
        }
        return maxMatrixElem;
    }

    static double calculateMatrixAverage(int[][] matrix, int numberOfRows, int numberOfColumns) {
        double sumOfElements = 0;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                sumOfElements += matrix[i][j];
            }
        }
        return Math.round((sumOfElements / (numberOfRows * numberOfColumns)) * 100) / 100.0;
    }

    static double calculateMatrixGeomMean(int[][] matrix, int numberOfRows, int numberOfColumns) {
        double multiplyEachElement = 1;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                multiplyEachElement *= matrix[i][j];
            }
        }
        return Math.round(Math.pow(multiplyEachElement, 1.0 / (numberOfRows * numberOfColumns)) * 100) / 100.0;
    }

    public static void main(String[] args) {
        int numberOfMatrixRows, numberOfMatrixColumns;
        while (true) {
            System.out.println("Enter matrix size:");
            System.out.println("Enter number of rows:");
            numberOfMatrixRows = enterNumber();
            System.out.println("Enter number of columns:");
            numberOfMatrixColumns = enterNumber();
            if (numberOfMatrixRows > 20 || numberOfMatrixColumns > 20) {
                System.out.println("Matrix size has to be less than 20x20.");
            } else break;
        }
        int[][] matrix = new int[numberOfMatrixRows][numberOfMatrixColumns];
        System.out.println("Do you wanna create matrix randomly or enter numbers yourself?");
        System.out.println("1. Randomly\n" + "2. Myself");
        System.out.println("Enter 1 or 2:");
        int numberToDecide = enterNumber();
        switch (numberToDecide) {
            case (1):
                matrix = createRandomMatrix(numberOfMatrixRows, numberOfMatrixColumns);
                break;
            case (2):
                System.out.println("Enter matrix element in interval [0;300]:");
                matrix = createMatrixYourself(numberOfMatrixRows, numberOfMatrixColumns);
                break;
        }
        System.out.println("Your matrix:");
        printMatrix(matrix, numberOfMatrixRows, numberOfMatrixColumns);
        System.out.println("Min element:");
        System.out.println(findMinimalMatrixElement(matrix, numberOfMatrixRows, numberOfMatrixColumns));
        System.out.println("Max element:");
        System.out.println(findMaximalMatrixElement(matrix, numberOfMatrixRows, numberOfMatrixColumns));
        System.out.println("Average:");
        System.out.println(calculateMatrixAverage(matrix, numberOfMatrixRows, numberOfMatrixColumns));
        System.out.println("Geometric mean:");
        System.out.println(calculateMatrixGeomMean(matrix, numberOfMatrixRows, numberOfMatrixColumns));
    }
}
