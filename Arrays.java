// Taking an array as an input and printing its elements.
import java.util.Scanner;

public class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.println("Enter the numbers for your array: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Your entered array numbers are: ");
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i] + " ");
        }

    }
}