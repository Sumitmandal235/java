// convert decimal to binary
import java.util.*;
public class binary_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] bin = new int[1000];
        int i=0;
        while(a>0){
            bin[i]=a%2;
            a=a/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
        sc.close();
    }
}
