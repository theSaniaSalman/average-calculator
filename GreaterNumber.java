// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.InputMismatchException;
import java.util.Scanner;

public class GreaterNumber {
    public static int compare(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = compare(a, b);
        System.out.println(greater + " is greater");
        sc.close();
    }
    
}
