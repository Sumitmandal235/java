// program to display all neon number between two number
public class neon {
    public static void main(String[] args) {
    int a =1;
    int b =100;
    for(int i =a;i<=b;i++){
        int squar = i*i;
        int num = squar;
        int temp = 0;
        while(num>0){
            int digit = num%10;
            temp =temp+digit;
            num=num/10;

        }
        if(temp==i){
            System.out.println(i);
        }

    }
    }
}
