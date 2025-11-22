

public class linearsearch {
    public static  int search (int arr[],int n){
         for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                return i;
            }
    }
    return -1;

}
    public static void main(String[] args) {
        int arr[] = {1,5,4,8,10};
        int n =1;
       
         int a = search(arr,n);   
        if(a==-1){
            System.out.println("element notfound");
        }
        else{
            System.out.println(" found at index "+a);
        }
        }
    }

