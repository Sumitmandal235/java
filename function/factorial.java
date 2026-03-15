// find the factorial of a number

public class factorial {

    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("inavalid number" + num);

        }
        int temp = 1;
        for (int i = 0; i <= num - 1; i++) {
            temp = temp * (num - i);
        }
        return temp;
    }

    public static void main(String[] args) {
        int factorial = factorial(-11);
        System.out.println(factorial);
    }
}
