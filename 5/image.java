public class image {
    public static void main(String[] args) {
        int arr[] = {20,1,6,3,5,1,1,1,6,1,6,1,1,1,6,1,5,1,3,1,5,1,5,5,5,1,4,1,5,1,4,1,4,1,5,1,3,3,2};
        // int arr[] = {27,3,1,1,3,3,3,7,2,1,3,2,4,1,7,1,4,1,5,1,4,1,7,1,4,1,10,1,7,1,4,1,5,1,4,1,7,1,5,1,3,1,5,1,7,1,6,3,5,3,6,1,3};
        int w = 1,width = 16;
        Character out[] = {'□','■'};
        
        System.out.println("<--- OUTPUT --->");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                System.out.print(out[i % 2]);
                if(w == width) {
                    System.out.println();
                    w = 1;
                }else{
                    w++;
                }
            }
        }
    }

}