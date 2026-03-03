public class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    void InsertatBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

    }

    void InsertatEnd(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }
    void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Null");
    }

}
