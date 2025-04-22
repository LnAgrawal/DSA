public class CustomStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public CustomStack(int size){
        this.maxSize= size;
        stackArray = new long[maxSize];
        this.top=-1;
    }

    public void push(long j){
        if(isFull()){
            System.out.println("Max size reached.");
            return;
        }
        top++;
        stackArray[top] = j;
    }
    public long pop(){
        if(isEmpty()){
            System.out.println("The stack is already empty");
            return -1;
        }
        int oldTop = top;
        top--;
        return stackArray[oldTop];

    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == (maxSize-1);
    }
}
