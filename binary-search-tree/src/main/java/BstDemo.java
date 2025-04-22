public class BstDemo {

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(10,"Ten");
        bst.insert(20,"Twenty");
        bst.insert(30,"Thirty");

        System.out.println("Min Value: "+ bst.findMin().getKey());
        System.out.println("Max Value: "+ bst.findMax().getKey());

    }
}
