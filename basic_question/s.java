// switch exmaple 
import java.util.*;
 class s {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            switch(button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("Namaste");
                case 3 -> System.out.println("Bonjour");
                default -> System.out.println("Invalid Button");
            }
        }
    }
}
