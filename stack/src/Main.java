public class Main {
    public static void main(String[] args) {
        CustomStack theCustomStack = new CustomStack(5);
        theCustomStack.push(20);
        theCustomStack.push(40);
        theCustomStack.push(50);
        theCustomStack.push(60);
        theCustomStack.push(70);
        theCustomStack.push(90);
        while(!theCustomStack.isEmpty()){
            System.out.println(theCustomStack.pop());
        }
        System.out.println(theCustomStack.pop());
        System.out.println(theCustomStack.pop());
        System.out.println(theCustomStack.pop());
    }
}