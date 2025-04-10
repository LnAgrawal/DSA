public class Example1ReverseStringUsingStack {
    public static String reverse(String s){
        String data="";
        CustomStack customStack = new CustomStack(s.length());
        for(char c : s.toCharArray()){
            customStack.push(c);
        }
        while (!customStack.isEmpty()){
            data += (char) customStack.pop();
        }
        return data;
    }
    public static void main(String[] args) {
        String s= "hello";
        System.out.println(reverse(s));
    }
}
