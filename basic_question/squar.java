// squar root of number 
public class squar {
    public static void main(String[] args) {
        int a = 106;
        for(int i = 2;i<a/2;i++){
            if(a<=i*i){
                System.out.println(i-1);
                break;
            }
        }
    }
}
