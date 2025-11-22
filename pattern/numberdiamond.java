public class numberdiamond {
    public static void main(String[] args) {
        int n =5;
        int h = 2*n-1;
        for(int i=1;i<=h;i++){
            int spaces = (i<=n) ? n-i : i-n;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            if(i==1 || i==h){
                System.out.print("1");
            }
            else if(i<=n){
                for(int j=1;j<=i-1;j++){
                    System.out.print(j);
                }
                System.out.print(i);
                for(int j=i-1;j>=1;j--){
                    System.out.print(j);
                }
            }
            else if(i>n && i<=h){
                for(int j=1;j<=h-i;j++){
                    System.out.print(j);
                }
                System.out.print(n-(i-n));
                for(int j=h-i;j>=1;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
