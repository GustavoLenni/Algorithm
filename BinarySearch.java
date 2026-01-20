public class BinarySearch {
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int n = array.length;
        int height = n - 1;
        int low = 0;
        int target = 10;

        // while is used when I don't know the length of my array
        while(low <= height){
            int mid = (height + low)/2;
            if(array[mid] == target){
                System.out.print(mid);
                return;
            }

            if (array[mid] > target) {
                height = mid -1;
            }else{
                low = mid + 1;
            }


        }
        System.out.println("Value is not found");

    }
}
