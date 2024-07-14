import java.util.Scanner;

public class OddNumsSum{
    public static void sum(int range){
        int sum = 0;
        if(range > 0){
        for(int i = 1; i<=range; i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("the sum is " + sum);
    }
    else{
        System.out.println("Invalid range");
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the range");
        int range = sc.nextInt();
        sum(range);
        sc.close();
    }
}