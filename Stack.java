public class Stack {
    static int[] stack = new int[3];
    static int top = -1;

    public static void Push(int value){
        if(top == stack.length -1 ){
            System.out.println("Stack Overflow");
        }else{
            top++;
            stack[top] = value;
        }
    }

    public static int Pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return - 1;
        }else{
            int value = stack[top];
            top --;
            return value;
        }
    }

    public static int Peek(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            return stack[top];
        }
    }

    public static void main(String[] args){
        Push(10);
        Push(20);
        Push(30);

        System.out.println("Top: "+ Peek());

        System.out.println("Top Removed " + Pop());
        System.out.println("Top: "+ Peek());
    }

}
