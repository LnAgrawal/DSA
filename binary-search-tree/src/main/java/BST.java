public class BST {
    private Node root;


    public void insert(int key, String value){
        Node newNode = new Node(key,value);
        if(root == null){
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while(true){
                parent = current;
                if(key < current.getKey()){
                    current = current.getLeft();
                    if(current == null){//It's parent is leaf node
                        parent.setLeft(newNode);
                        break;
                    }
                } else {
                    current = current.getRight();
                    if(current == null ){
                        parent.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }
    public Node findMin(){
        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.getLeft();

        }
        return last;
    }
    public Node findMax(){
        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.getRight();

        }
        return last;
    }
}
