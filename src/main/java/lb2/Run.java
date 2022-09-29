package lb2;
import java.util.Scanner;
public class Run {
    static int input_number(){
        Scanner input_number = new Scanner(System.in);
        return input_number.nextInt();
    }
    static void random_matrix(int[][] matrix,int row,int column,int min_num,int max_num)
    {
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix[i][j]=(int)(Math.random() * (max_num - min_num + 1)) + min_num;
            }
        }
    }
    static void input_matrix(int[][] matrix,int row,int column,int min_num,int max_num)
    {
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix[i][j]=input_number();
                while (true)
                {
                    if ((matrix[i][j]>max_num)||(matrix[i][j]<min_num))
                    {
                        System.out.println("Введений елемент не в діапазоні [-10;10]!");
                        System.out.println("Введіть ще раз:");
                        matrix[i][j]=input_number();
                    }
                    else break;
                }
            }
        }
    }
    static void print_matrix(int[][] matrix, int row, int column)
    {
        System.out.println("Ваша матриця:");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.println("["+i+"]["+j+"] = "+matrix[i][j]);
            }
        }
    }
    static int min_matrix(int[][] matrix, int row, int column)
    {
        System.out.println("Мінімальний елемент матриці:");
        int min_elem=matrix[0][0];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if (min_elem>matrix[i][j])
                {
                    min_elem=matrix[i][j];
                }
            }
        }
        return min_elem;
    }
    static int max_matrix(int[][] matrix, int row, int column)
    {
        System.out.println("Максимальний елемент матриці:");
        int max_elem=matrix[0][0];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if (max_elem<matrix[i][j])
                {
                    max_elem=matrix[i][j];
                }
            }
        }
        return max_elem;
    }
    static void avrg_matrix(int[][] matrix, int row, int column)
    {
        System.out.println("Середнє арифметичне матриці:");
        double sum=0;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                sum+=matrix[i][j];
            }
        }
        System.out.println(sum/(row*column));
    }
    static void geom_matrix(int[][] matrix, int row, int column)
    {
        System.out.println("Середнє геометричне матриці:");
        double mult=1;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                mult*=matrix[i][j];
            }
        }
        System.out.println(Math.pow(mult, 1.0/(row*column)));
    }
    public static void main(String[] args) {
        int rows,columns;
        final int max=300;
        final int min=0;
        while (true)
        {
            System.out.println("Вкажіть розміри матриці:");
            System.out.println("Введіть кількість рядків:");
            rows = input_number();
            System.out.println("Введіть кількість стовпців:");
            columns = input_number();
            if (rows>20 || columns>20)
            {
                System.out.println("Розмір матриці повинен не перевищувати 20 на 20.");
            }
            else break;
        }
        int[][] matrix = new int[rows][columns];
        System.out.println("Бажаєте створити матрицю рандомно чи ввести значення самостійно?");
        System.out.println("1. Рандомно\n"+"2. Самостійно");
        System.out.println("Введіть 1 чи 2:");
        int num_decision = input_number();
        switch (num_decision)
        {
            case (1):
                random_matrix(matrix,rows,columns,min,max);
                break;
            case (2):
                System.out.println("Введіть елементи матриці в діапазоні [-10;10]:");
                input_matrix(matrix,rows,columns,min,max);
                break;
        }
        print_matrix(matrix,rows,columns);
        System.out.println(min_matrix(matrix,rows,columns));
        System.out.println(max_matrix(matrix,rows,columns));
        avrg_matrix(matrix,rows,columns);
        geom_matrix(matrix,rows,columns);
    }
}
