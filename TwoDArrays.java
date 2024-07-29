// Taking a 2D matrix as an input and printing its elements.

import java.util.Scanner;

public class TwoDArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your 2D array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int nums[][] = new int[rows][cols];

        System.out.println("Enter the elements of your 2D array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("The elements of your 2D array are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}