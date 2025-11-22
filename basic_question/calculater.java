// calculater using switch
import java.util.*;

public class calculater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        switch (s) {
            case ("+") -> System.out.println(a + b);

            case ("-") -> System.out.println(a - b);

            case ("*") -> System.out.println(a * b);

            case("/") -> System.out.println(a/b);

            default -> System.out.println("invalid input");
        }
    }
}
