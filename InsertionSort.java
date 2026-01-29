public class InsertionSort {
    public static void main(String[] args){
        int [] arr = {8,2,3,11,9,4};

        for(int steps = 1;steps < arr.length; steps++){
            int choice = arr[steps];
            int index = steps;
            for(int a = steps - 1; a >= 0 ;a--){
                if(choice<arr[a]){
                    arr[a+1] = arr[a];
                    index = a;
                }
            }
            arr[index] = choice;
        }
        for(int result = 0;result<arr.length;result++){
            System.out.println(arr[result]);
        }
    }
}
