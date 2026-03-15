//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class greatest {

    public static int compare(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Gretaest number among two is :" + compare(a, b));
        sc.close();

    }
}
