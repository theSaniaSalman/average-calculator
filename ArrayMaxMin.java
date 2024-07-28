// Find the maximum & minimum number in an array of integers. 
import java.util.Scanner;

public class ArrayMaxMin{
    public static int findMax(int nums[]){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static int findMin(int nums[]){
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.println("Enter the numbers for your array: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int maxNum = findMax(nums);
        int minNum = findMin(nums);  

        System.out.println("Largest number is : " + maxNum);
        System.out.println("Smallest number is : " + minNum);
    }
}