// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class Circumference {
    public static float calculate(float radius){
        float pi = 3.142f;
        float cf = 2 * pi * radius;
        return cf;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius = sc.nextFloat();
        float circumference = calculate(radius);
        System.out.println("The circumference of the circle is " + circumference);
        sc.close();
    }
}
