// factorial of a number
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 1;
        while(num>1){
            temp = temp*num;
            num--;
        }
        System.out.println("factorial is:"+temp);
    }
}
