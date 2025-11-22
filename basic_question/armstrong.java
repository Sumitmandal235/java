// print armstrong number btween two number
public class armstrong {

    public static void main(String[] args) {
        int a = 100;
        int b = 300;
        for (int i = a; i <= b; i++) {
            int num = i;
            int temp = 0;
            while (num > 0) {
               
                int digit = num% 10;

                temp = temp + (digit*digit*digit);
                num = num / 10;

            }
            if (temp == i) {
                System.out.println(i + " armstrong number");
            }
        }
    }
}
