//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class vote {

    public static void eligible(int age) {
        if(age>=18){
            System.out.println("eligible for vote");
        }
        else if(age<1){
            System.out.println("enter valid age");
        }
        else{
            System.out.println("not eligible for vote");
        }
            
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = sc.nextInt();
        eligible(age);
        sc.close();

    }
}
