// count digit in integer
public class count_digit {
    public static void main(String[] args) {
        int a = 456213;
        int i =0;
        if(a==0){
            System.out.println("number of digit is 1");
        }
        else{
            while(a!=0){

                a = a/10;
                i++;
            }
        }
        System.out.println("number of digit is "+i);
    }
}
