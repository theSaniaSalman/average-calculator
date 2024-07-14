// Write a program to enter the numbers till the user wants and at the end it should display 
// the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class NumbersType{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a range of numbers to enter");
        int range = sc.nextInt();
        int num, p=0, n=0, z=0;
        System.out.println("Enter the numbers");
        for(int i=0; i<range; i++){
            num = sc.nextInt();
            if(num > 0){
                p++;
            }
            else if(num<0){
                n++;
            }
            else{
                z++;
            }
        }
        System.out.println("Positives: " + p);
        System.out.println("Negatives: " + n);
        System.out.println("Zeros: " + z);
        sc.close();
    }
}