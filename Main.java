import java.io.BufferedReader;//import BufferedReader
import java.io.InputStreamReader; // import InputStreamReader to receive data entries
import java.io.IOException;

public class Main {
    // create class

    // static = it can be accessed without creating an object
    // void = it doesn't return any value
    // String[] args = it is an array to receive the values from the terminal
//    public static void main(String[] args){
//        System.out.println("Hello World!");
//    }

//    public static void main(String[] args) {
////   String name = "Gustavo";
////        int age = 18;
////        double weight = 65.5;
////
////     System.out.println("My name is " + name);
////        System.out.println("I have a " + age + " Years Old");
////        System.out.println("I weight " + weight + " Kilos");
//
////  data entries in aplication
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = "";
//        try{
//            name = reader.readLine();
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("The name typed was " + name);
//
//    }

//    public static void main(String[] args){
//        int age = 15;
//        String name = "Gustavo";

//        if(age >= 18){
//            System.out.println("You can enter");
//        }else{
//            System.out.println("You can't enter");
//        }

//        if(name == "Gustavo"){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }

    public static void main(String[] args) throws Exception{
        // Loops\
        // while = conditional loop: true or false
//        int contador = 0;
//        while (contador < 3) {
//            System.out.println("Hello loop " + contador);
//            contador++;
//        }

        //do while = conditional loop, but check later
//        do {
//            System.out.println("Hello loop" + contador);
//            contador++;
//        }while(contador < 3);

        //FOR
        for (int i = 1; i < 3; i++){
            System.out.println(i);
        }

    }
}


