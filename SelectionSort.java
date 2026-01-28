public class SelectionSort {
    public static void main(String[] args){

        int [] arr = {5,11,33,2,7,9,1};

        // Loop to selects the current position to be Ordered
        for(int i = 0;i < arr.length; i++){

            int smallest = arr[i];
            int index = i;
            // Loop that searches for the smallest number
            for(int a = i+1;a < arr.length;a++){
                if(arr[a] < smallest){
                    smallest = arr[a];
                    index = a;
                }
            }
            // replace smallest number for correct position
            // and replace old number to correct position the old position of smallest number
            int temp = arr[i];
            arr[i] = smallest;
            arr[index] = temp;
        }

        //Result of my arr ordered
        for(int result = 0; result< arr.length;result++){
            System.out.println(arr[result]);
        }
    }
}
