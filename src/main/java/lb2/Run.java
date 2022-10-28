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
                        System.out.println("Entered number is outside of [-10;10]!");
                        System.out.println("Enter a new number:");
                        matrix[i][j]=input_number();
                    }
                    else break;
                }
            }
        }
    }
    static void print_matrix(int[][] matrix, int row, int column)
    {
        System.out.println("Your matrix:");
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
        System.out.println("Minimal element:");
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
        System.out.println("Maximm element:");
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
        System.out.println("Average:");
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
        System.out.println("Geometric mean:");
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
            System.out.println("Enter matrix'size:");
            System.out.println("Enter number of rows:");
            rows = input_number();
            System.out.println("Enter number of columns:");
            columns = input_number();
            if (rows>20 || columns>20)
            {
                System.out.println("Matrix's size has to be less than 20x20.");
            }
            else break;
        }
        int[][] matrix = new int[rows][columns];
        System.out.println("Do you wanna create matrix randomly or enter numbers yourself?");
        System.out.println("1. Randomly\n"+"2. Myself");
        System.out.println("Enter 1 or 2:");
        int num_decision = input_number();
        switch (num_decision)
        {
            case (1):
                random_matrix(matrix,rows,columns,min,max);
                break;
            case (2):
                System.out.println("Enter matrix's element in interval [-10;10]:");
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
