
import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.

public class circle {
    public static int circumference(int r){
        return 2*(22/7)*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle");
        int r = sc.nextInt();
        System.out.println("circumference of the circle "+circumference(r)+"m");
        sc.close();
    }
}
