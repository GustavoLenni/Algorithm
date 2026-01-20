public class Exercise_Logic {

//    public static void main(String[] args){
//        int [] arr = {1,8,9,21,11,7,3,2};
//
//        int [] ordered = new int[arr.length];
//
//        for(int ordenation = 0;ordenation < ordered.length;ordenation++){
//            int smallest = arr[0];
//            int index = 0;
//
//            for(int desordered = 1; desordered < arr.length; desordered++){
//                if(arr[desordered]<smallest){
//                    smallest = arr[desordered];
//                    index = desordered;
//                }
//            }
//            ordered[ordenation] = smallest;
//
//            arr[index] = Integer.MAX_VALUE;
//
//        }
//        for(int resultado = 0; resultado < ordered.length; resultado++){
//            System.out.println(ordered[resultado]);
//        }
//    }

    // second smallest exercise
    public static void main(String[] args){
        int [] arr = {5, 2, 9, 1, 7};

        int smallest = arr[0];
        int second = Integer.MAX_VALUE;


        for(int i = 1;i < arr.length;i++){
            if(arr[i]<smallest){
                second = smallest;
                smallest = arr[i];
            }
            else if(arr[i]> smallest && arr[i]<second){
                second = arr[i];
            }

        }
        System.out.print(second);
    }
}
