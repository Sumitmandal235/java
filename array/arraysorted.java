public class arraysorted {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,78};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("array is not sorted");
                break;
            }
            if(i==arr.length-2){
                System.out.println("array is sorted");
            }
        }
        

    }
}
