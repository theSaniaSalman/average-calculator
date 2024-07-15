// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int firstNum = 0; 
        int secondNum = 1;
       System.out.println("The Fibonacci series is: ");
        for(int i = 0; i<terms; i++){ // 0 1
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum; // 1
            firstNum = secondNum;
            secondNum = nextNum;
        }
        sc.close();

    }
}
