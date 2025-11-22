public class numberspiral {
    public static void main(String[] args) {
        int n=5;
        int size = 2*n-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int top = j;
                int bottom=size-1 -top;
                int left = i;
                int right = size-1-left;
                int min =top;
                if (left < min) min = left;
                if (bottom < min) min = bottom;
                if (right < min) min = right;

                System.out.print(1 + min);

            }
            System.out.println();
        }

}
}
