public class pyramidpadlirom {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
                if(i==1){
                    System.out.print(i);
                }
               else if(i<=n){
                int count = ((2*i-1)/2);
                for(int k=count;k>=1;k--){
                    System.out.print(i-k);
                }
                System.out.print(i);
               
                for(int k=1;k<=(2*i-1)/2;k++){
                    System.out.print(i-k);
                }
                }
            
            
            System.out.println();
        }
        }
        }
    

