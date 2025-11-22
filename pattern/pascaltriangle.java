public class pascaltriangle {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int number = 1; // first number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // Calculate next number using formula
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

