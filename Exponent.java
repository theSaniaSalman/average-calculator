// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;
   
public class Exponent{
    public static double raisePower(double base, double power){
        double result = 1;
        for(int i=0; i<power; i++){
            result = result * base;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the base and exponent");
        double base = sc.nextDouble();
        double power = sc.nextDouble();
        double result = raisePower(base, power);
        System.out.println("The result is " + result);
        sc.close();
    }
}