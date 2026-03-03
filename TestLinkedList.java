public class TestLinkedList {
    public static void main(String[] args){
        LinkedList linked = new LinkedList();

        linked.InsertatBeginning(2);
        linked.InsertatBeginning(1);
        linked.InsertatEnd(3);
        linked.InsertatEnd(4);

        linked.printList();
    }
}
