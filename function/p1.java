import java.util.*;
public class p1 {
    public static int power(int a , int b){
        int temp = a;
        for(int i =1;i<b;i++){
              a= a*temp;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = power(a,b);
        System.out.println(p);
    }
}
