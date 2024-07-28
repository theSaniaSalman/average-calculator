// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class ArrayNames{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        System.out.println("Enter the names in your array: ");
        for(int i=0; i<names.length; i++){
            names[i] = sc.next();
        }

        System.out.println("The names in your array are: ");
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

    }
}