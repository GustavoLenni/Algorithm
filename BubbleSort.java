public class BubbleSort {
    public static void main(String[] args){
        int [] arr = {9,2,3,12,1,10};


        for(int i = 0;i < arr.length; i++){
            for(int index = 0; index< arr.length -1; index++){
                int temp = arr[index];
                if(arr[index]>arr[index+1]){
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }

            }

        }
        for(int resultado = 0;resultado < arr.length;resultado++){
            System.out.println(arr[resultado]);
        }
    }
}
