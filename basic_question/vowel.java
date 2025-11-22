// check for vowel 
import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        switch(ch){
            case('a'):System.out.println("vowel");
            break;
            case('e'):System.out.println("vowel");
            break;
            case('i'):System.out.println("vowel");
            break;
            case('o'):System.out.println("vowel");
            break;
            case('u'):System.out.println("vowel");
            break;
            default:System.out.println("constant");
        }

    }
}
