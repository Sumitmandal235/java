// display even postion fibonnaci sum 
import java.util.*;
public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int sum = 0;
        for(int i=0;i<=num-2;i++){
           int temp = a+b;
           a = b;
           b = temp;
           if(i%2==0){
               sum = sum + temp;
           }
        }
        System.out.println("Sum of alternate Fibonacci numbers: " + sum);
    }
}
