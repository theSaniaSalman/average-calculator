// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;

import java.util.Scanner;

public class VotingAge {
    public static String checkAge(int age){
        String result = "";
        if(age >= 18){
            result = "You are eligible to vote";
            return result;
        }
        else{
            result = "You are not eligible to vote yet";
            return result;
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        String eligibility = checkAge(age);
        System.out.println(eligibility);
        sc.close();
    }
}
