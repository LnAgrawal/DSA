public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        queArray = new long[maxSize];
        front=0;
        rear=-1; //there is no item in the array to be considerd
        nItems=0;
    }

    public void insert(long j){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public long remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        long oldFront = queArray[front];
        front++;

        nItems--;
        return oldFront;
    }
    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return nItems==0;
    }
    public boolean isFull(){
        return nItems == maxSize;
    }
    public void view(){
        for(int i=0; i< queArray.length; i++){
            System.out.print(queArray[i]+" ");
        }
    }

}
