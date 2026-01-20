import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;

public class Exercises {

    // First exercise
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Enter your name: ");
//        String name = reader.readLine();
//
//        System.out.println("Enter your age: ");
//        int age = Integer.parseInt(reader.readLine());
//
//        System.out.println("Hello, " + name + "! You are " + age + " years old");
//    }
    //Exercise two
//    public   static void main(String[] args){
//        //data structure Hashmap (keys and value)
//        HashMap<String, Integer> person = new HashMap<>();
//
//        person.put("gustavo",18);
//        person.put("Maria", 72);
//
//        //traverse in structure Hashmap
//        for(var entry : person.entrySet()){
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }
//    }

//    Exercise 3three
//   LinearSearch in Hashmap
    public static void main(String[] args){
        HashMap<String, Integer> person = new HashMap<>();

        person.put("Gustavo", 18);
        person.put("Lenilson", 52);
        person.put("Maria", 72);
//        boolean found = false;
        String target = "Gustavo";

        // O(n)
//        for(var entry : person.entrySet()){
//            if(entry.getValue() == target){
//                System.out.print(entry.getKey() + "-" + entry.getValue());
//                found = true;
//                break;
//            }
//        }

        //O(1)
        if(person.containsKey(target)){
            System.out.print(person.get(target));
        }
        else{
            System.out.print("Not found");
        }
    }
}
