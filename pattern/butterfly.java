public class butterfly {
    public static void main(String[] args) {
        int n =7;
        int mid = n/2 +1;
        int m = 8;
         for (int i = 1; i <= n; i++) {
            int temp = 2*i;
            int spaces = (i<=mid) ? m-temp : temp-m;
            int star = (i<=mid) ? i : i-(temp-m);
             for(int j =1;j<=star;j++){
                System.out.print("*");
             }
             for(int j =1;j<=spaces;j++){
                System.out.print(" ");
             }
             for(int j =1;j<=star;j++){
                System.out.print("*");
             }
             System.out.println();
         }
    }
}
