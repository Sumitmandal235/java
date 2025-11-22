public class methodtype {
    int a =15;
    static int b=16;

    static void Show(){
        System.out.println(b);
    }
    void Display(){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        methodtype obj = new methodtype();
        obj.Display();
        methodtype.Show();
    }
}
