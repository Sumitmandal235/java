// Write a function to print the sum of all odd numbers from 1 to n.

public class odd {
    public static void odd_number(int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        
        odd_number(15);
    }
}
