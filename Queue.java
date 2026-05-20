public class Queue {
        int arr [] = new int[5];

        int head = 0;
        int tail = -1;
        int size = 0;

        public void Insert(int value){
            if(size == arr.length){
                System.out.println("Queue full");
                return;
            }
            tail++;
            arr[tail] = value;
            size++;
        }
        public void Delete(){
            if(size == 0){
                System.out.println("Queue empty");
                return;
            }
            head++;
            size--;
        }
        public void Show(){
            for(int i = head; i<=tail;i++){
                System.out.println(arr[i]+" ");
            }
        }

        public static void main(String[] args){
            Queue q = new Queue();
            q.Insert(5);
            q.Insert(10);
            q.Insert(50);
            q.Insert(20);
            q.Insert(100);
            q.Delete();


            q.Show();

        }



}

