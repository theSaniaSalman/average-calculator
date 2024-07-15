import java.util.Scanner;

public class GCDEuclidean{
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b; 
            b = a % b; 
            a = temp; 
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        sc.close();
    }
}