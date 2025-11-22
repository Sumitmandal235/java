// hcf and lcm of the two number
public class hcf {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
         int hcf = (a<b) ? a:b;
        
        while(true){
            if(a%hcf==0 && b%hcf==0){
                
                System.out.println("hcf is :"+hcf);
                break;
            }
            --hcf;
        }
        System.out.println("lcm of the number are "+(a*b)/hcf);
    }
}
  