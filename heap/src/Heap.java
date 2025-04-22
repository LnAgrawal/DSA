public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        currentSize=0;
        heapArray = new Node[maxSize];
    }

    public int getSize(){
        return this.currentSize;
    }

    public boolean isEmpty(){
        return this.currentSize == 0;
    }

    public boolean insert(int key){
        if(currentSize == maxSize){
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize);
        currentSize++;
        return true;
    }

    private void trickleUp(int idx) {
        int parentIndex = (idx-1)/2;
        Node nodeToInsert = heapArray[idx];
        //check if idx is not reached to root, and current parent is less than the nodeToInert
        while(idx>0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()){
            heapArray[idx] = heapArray[parentIndex];
            idx = parentIndex;
            parentIndex = (parentIndex-1)/2;
        }
        heapArray[idx] = nodeToInsert;
    }

    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];

        tickleDown(0);
        return root;
    }

    private void tickleDown(int idx) {
        int largerChildIdx;
        Node top = heapArray[idx];

        while(idx < currentSize){
            int leftChildIdx = 2*idx +1;
            int rightChildIdx = 2*idx +2;
            if(rightChildIdx < currentSize && heapArray[leftChildIdx].getKey() < heapArray[rightChildIdx].getKey()){
                largerChildIdx = rightChildIdx;
            } else {
                largerChildIdx = leftChildIdx;
            }

            if(top.getKey()>= heapArray[largerChildIdx].getKey()){
                break;
            }

            heapArray[idx] = heapArray[largerChildIdx];
            idx = largerChildIdx;

        }

        heapArray[idx] = top;
    }

    public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentSize; m++) {
            if(heapArray[m] != null) {
                System.out.print( heapArray[m].getKey() + " ");
            }
            System.out.println();

            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item

            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[j].getKey());
                j++;
                if(j == currentSize) {
                    break;
                }

                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("\n"+dots+dots);
        }


    }
}
