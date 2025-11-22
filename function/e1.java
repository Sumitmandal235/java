import java.util.*;
public class e1 {
    public static void printname(String name){
        System.out.println(name);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            printname(name);
        }

    }
}
