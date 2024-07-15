// Write a function that calculates the Greatest Common Divisor of 2 numbers. 

// How to find GCD:
// Step 1: Write the divisors of the number 'a'.
// Step 2: Write the divisors of the number 'b'.
// Step 3: List the common divisors of 'a' and 'b'.
// Step 4: Now find the divisor which is the highest among the common divisors.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GCD{
    public static int findGCD(int a, int b){
        ArrayList<Integer> factors1 = new ArrayList<>();
        ArrayList<Integer> factors2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Factors of first number
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                factors1.add(i);
            }
        }

        // Factors of second number
        for(int i=1; i<=b; i++){
            if(b%i == 0){
                factors2.add(i);
            }
        }

        // Comparing factors
        for(int i = 0; i < factors1.size(); i++){
            for(int j = 0; j < factors2.size(); j++){
                if(factors1.get(i) == factors2.get(j)){
                    result.add(factors1.get(i));
                    break;
                }
            }
        }

        // Finding GCD
        int gcd = Collections.max(result);

        System.out.println("The factors of " + a + " are " + factors1);
        System.out.println("The factors of "+ b + " are " + factors2);
        return gcd;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        System.out.println("The GCD is " + gcd);
        sc.close();
    }
}


