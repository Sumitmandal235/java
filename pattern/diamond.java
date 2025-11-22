public class diamond {
    public static void main(String[] args) {
        int n =7;
        int mid = n/2 +1;
        for(int i=1;i<=n;i++){
            int spaces = (i<=mid) ?  mid-i : i-mid;
            int stars = (i<=mid) ? 2*i-1 : 2*(n-i+1)-1;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
