public class Recursive {
    // Recursive function of Numbers
//    public static void Numbers(int i){
//        if(i < 0){
//            return;
//        }
//        System.out.println(i);
//        Numbers(i - 1);
//    }
//    public static void main(String[] args){
//        Numbers(10);
//    }


    //Recursive factorial function
    public static int Factorial(int i){
        if(i == 0  || i == 1){
            return 1;
        }
        return i * Factorial(i-1);
    }

    public static void main(String[] args){
        System.out.println(Factorial(5));
    }
}
