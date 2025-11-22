
import java.util.*;
public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arry");
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter value at index "+ i);
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
