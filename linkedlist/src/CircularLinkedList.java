public class CircularLinkedList {
    private Node head;
    private Node last;

    public CircularLinkedList(){
        this.head = null;
        this.last= null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void insertFirst(int data){
        Node  node = new Node(data);
        if(head == null){
            head = node;
            last = node;
            return;
        }
        node.setNext(head);
        head = node;
    }

    public Node deleteFirst(){
        Node temp = head;
        if(head.getNext() == null){
            last = null;
        }
        head = head.getNext();
        return temp;
    }
    public void insertLast(int data){
        Node  node = new Node(data);

        if(head == null){
            head = node;
            last = node;
            return;
        }

        last.setNext(node);
        last = node;

    }
    public void displayList(){
        System.out.println("List (First --> Last)");
        Node current = head;
        while(current!= null){
            System.out.println(current.toString());
            current = current.getNext();
        }
    }
}
