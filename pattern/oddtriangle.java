public class oddtriangle {
    public static void main(String[] args) {
        int n =4;
       
        for(int i=1;i<=n;i++){
             int count =1;
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count= count+2;
            }
            System.out.println();
        }
    }
}
