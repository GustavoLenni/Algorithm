public class QuickSort {
    public static void main(String[] args){
        int [] arr = {8,65,1,2,6};

        int pivot = arr[arr.length-1];
        int index_border = -1;

        for(int i = 0; i < arr.length -1;i++){
            if(arr[i] < pivot){
                index_border++;
                int temp = arr[i];
                arr[i] = arr[index_border];
                arr[index_border] = temp;
            }
        }
        int temp = arr[index_border+1];
        arr[index_border+1] = pivot; // correct position pivot
        arr[arr.length-1] = temp; // oldest position of pivot

        for(int result = 0; result < arr.length; result++){
            System.out.println(arr[result]);
        }
    }


}
