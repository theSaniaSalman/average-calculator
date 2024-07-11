import java.util.Scanner;

public class Average {

    public static void getAverage(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("The average is " + avg);
    }

    public static void main(String[] args){
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        getAverage(a, b, c);
        sc.close();

    }
}