
import java.util.ArrayList;

public class ledear {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();

       int arr[] = {16, 17, 4, 3, 5, 2};
       int n = arr.length-1;
       for(int i=0;i<arr.length;i++){
        int temp = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>temp){
                    break;
                }
                if(j==n){
                    result.add(arr[i]);
                }
                
            }
            
       }
      for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
