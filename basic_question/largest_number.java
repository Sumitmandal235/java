// largest number between three number
public class largest_number {
    public static void main(String[] args) {
        int a = 19 ;
        int b = 16;
        int c = 1;
        if(a>b){
            if(a>c){
                System.out.println("a is greater number");
            }
            else{
                System.out.println("c is greater number");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater ");
            }
            else{
                System.out.println("c is greater number");
            }
        }
    }
}
