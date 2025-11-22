// print right angle triangle

public class right_angled_triangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(i==j || i>j){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }
}
