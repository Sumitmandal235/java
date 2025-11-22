// lcm of the two number
public class lcm {
    public static void main(String[] args) {
      int a = 2;
      int b = 3;
      int lcm = (a>b) ? a:b;
      while (true) { 
          if(lcm%a==0 && lcm%b==0){
            System.out.println("lcm is :"+lcm);
            break;
          }
          ++lcm;
      }
    }
    }

