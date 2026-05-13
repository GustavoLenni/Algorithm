package Ordenation;

public class QuickSort {
    public static void main(String[] args){
        int arr[] = {2,4,5,9,8};

        quicksort(arr,0, arr.length-1);

        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void quicksort(int arr[], int low, int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);

            quicksort(arr, low,pivotIndex -1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int index_border = low - 1;

        for(int i = low; i < high; i++ ){
            if(arr[i] < pivot){
                index_border++;

                int temp =  arr[i];
                arr[i] = arr[index_border];
                arr[index_border] = temp;
            }
        }
        int temp = arr[index_border+1];
        arr[index_border+1] = arr[high];
        arr[high] = temp;

        return index_border + 1;
    }
}
