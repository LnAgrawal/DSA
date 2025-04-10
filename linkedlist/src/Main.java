public class Main {
    public static void main(String[] args) {
       /*        Node node1 = new Node(4);
        Node node2 = new Node(3);
        Node node3 = new Node(7);
        Node node4 = new Node(8);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        System.out.println(node1);

        System.out.println(listLength(node3));*/

        //SinglyLinkedList list = new SinglyLinkedList();
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertFirst(30);
        list.insertLast(40);
        list.insertFirst(50);

        list.displayList();

    }

    public static int listLength(Node node){
        int result=0;
        while(node != null){
            result++;
            node = node.getNext();
        }
        return result;
    }
}