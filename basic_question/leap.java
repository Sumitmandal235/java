// programe to check leap year
import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year =sc. nextInt();

        if(year%4==0 && year%100==0){
            if(year%400==0){
                System.out.println("given year is leap year");
            }
            else{
                System.out.println("not a leap year");
            }
        }
        else{
            if(year%4==0){
                System.out.println("the given year is leap year");
            }
            else{
                System.out.println("given year is not leap year");
            }
        }


    }
}
