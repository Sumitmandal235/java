public class numchartriangle {
    public static void main(String[] args) {
        int n =4;
        for(int i=1;i<=n;i++){
            int count = 1;
            char ch ='A';
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch);
                    ch++;
                }
                else{
                    System.out.print(count);
                    count++;
                }
            }
            System.out.println();
        }
    }
}
