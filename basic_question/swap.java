// swaping of two number without using third variable
public class swap {
    public static void main(String[] args) {
        int a = 15;
        int b = 12;
        /*a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b); */

        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+"b="+b);



    }
}
