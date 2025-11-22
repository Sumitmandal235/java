public class palindromnumberpyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print("1");
            }
            else{
            for(int j=i;j>1;j--){
                System.out.print(j);
            }
            System.out.print(1);
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
           
        }
         System.out.println();
    }
    }
}
