public class Main {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
        theQueue.insert(100);
        theQueue.insert(200);
        theQueue.insert(300);
        theQueue.insert(400);
        theQueue.insert(500);
        theQueue.insert(500);
        theQueue.insert(500);    theQueue.insert(500);

        theQueue.view();

    }
}