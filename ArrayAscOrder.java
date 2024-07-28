// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class ArrayAscOrder{
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

        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       // {3, 4, 6, 2} is not sorted in ascending order.

        boolean ascending = true;
        for(int i=nums.length-1; i>1; i--){
            if(nums[i] < nums[i-1]){;
                ascending = false;
                break;
            }
        }

        if(ascending){
            System.out.println("The array is in ascending order");
        }
        else{
            System.out.println("The array is not in ascending order");
        }

    }
}
