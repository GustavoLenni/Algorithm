public class Ordenation {

    public static void main(String[] args){
        int [] arr = {10,2,3,13,7,8,11,7};


        int [] new_arr = new int[arr.length];


        for(int a = 0; a <new_arr.length;a++){
            int bigger = arr[0];
            int bigger_index = 0;

            for(int i = 1; i< arr.length;i++){
                if(arr[i]>bigger){
                    bigger = arr[i];
                    bigger_index = i;
                }
            }

            new_arr[a] = bigger;

            arr[bigger_index] = Integer.MIN_VALUE;
        }

        for(int o = 0; o < new_arr.length;o++){
            System.out.println(new_arr[o]);
        }


    }
}
