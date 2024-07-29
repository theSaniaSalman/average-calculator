// Searching for an element x in a 2D matrix.

// Taking a 2D matrix as an input and printing its elements.

import java.util.Scanner;

public class TwoDArraysSearch{
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
        System.out.println("Enter the element to search: ");
        int element = sc.nextInt();

        sc.close();

        System.out.println("Searching...");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(nums[i][j] == element){
                    System.out.print("Element found at location: " + "[" + i + "]" + "[" + j + "]");
                }          
            }
        }
    }
}