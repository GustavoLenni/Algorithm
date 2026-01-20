public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int target = 9;

        // for is used when I know the number of elements
        for(int i =0;i <10;i++){
            if(arr[i] == target){
                System.out.print(i);
            }
        }
    }
}
