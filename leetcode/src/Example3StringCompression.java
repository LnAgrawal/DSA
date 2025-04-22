public class Example3StringCompression {
    public static int compress(char[] chars) {
        if(chars.length <= 2){
            return chars.length;
        }

        int result =0, currentLength=1;
        char prevChar = chars[0];
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        for(int i=1; i< chars.length; i++){
            if(prevChar == chars[i]){
                currentLength++;
            } else {
                sb.append(String.valueOf(currentLength));
                sb.append(chars[i]);
                currentLength =1;
            }
            prevChar = chars[i];
        }
        if(currentLength>1){
            sb.append(String.valueOf(currentLength));
        }
        System.out.println(sb.toString());
        int i=0;
        for(char c : sb.toString().toCharArray()) {
            chars[i] = c;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }
}
