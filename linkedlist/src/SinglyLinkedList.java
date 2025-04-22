public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void insertFirst(int data){
        Node  node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }

    public Node deleteFirst(){
        Node temp = head;
        head = head.getNext();
        return temp;
    }
    public void insertLast(int data){
        Node  node = new Node(data);

        if(head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node);

    }
    public void displayList(){
        System.out.println("List (First --> Last)");
        Node current = head;
        while(current!= null){
            System.out.println(current.toString());
            current = current.getNext();
        }

    }

    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;
        while(current !=null){
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }
}
