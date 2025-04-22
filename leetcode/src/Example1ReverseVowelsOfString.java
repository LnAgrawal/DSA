import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;

public class Example1ReverseVowelsOfString {
    public static Boolean isVowels(Character c) {
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }
    /*public static void main(String[] args) {
        String s = "leetcode";

        char[] data = s.toCharArray();
        int start = 0, end=s.length()-1;
        StringBuilder sb = new StringBuilder(s);

        while(start < end){
            boolean isStartVowelsFound = isVowels(data[start]);
            boolean isEndVowelsFound = isVowels(data[end]);
            if(!isStartVowelsFound)
            {
                start++;
            }
            if(!isEndVowelsFound)
            {
                end--;
            }
            if(isStartVowelsFound && isEndVowelsFound){
                char temp = data[start];
                data[start] = data[end];
                data[end] = temp;
                start++;
                end--;
            }


        }

        System.out.println(String.valueOf(data));
      //  assert  String.valueOf(data) =="leotcede";
    }*/

    public static void main(String[] args) {
        String s = "leetcode";

        //char[] data = s.toCharArray();
        int start = 0, end=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        boolean isStartVowelsFound = false,isEndVowelsFound = false;
        while(start < end){
             isStartVowelsFound = !isStartVowelsFound?isVowels(sb.charAt(start)): isStartVowelsFound;
             isEndVowelsFound = !isEndVowelsFound?isVowels(sb.charAt(end)):isEndVowelsFound;
            if(!isStartVowelsFound)
            {
                start++;
            }
            if(!isEndVowelsFound)
            {
                end--;
            }
            if(isStartVowelsFound && isEndVowelsFound){
                char temp = sb.charAt(start);
                sb.setCharAt(start,sb.charAt(end));
                sb.setCharAt(end,temp);
                //data[end] = temp;
                start++;
                end--;
                isStartVowelsFound = isEndVowelsFound = false;
            }
        }

       // System.out.println(String.valueOf(data));
        System.out.println(sb.toString());
        //  assert  String.valueOf(data) =="leotcede";
    }
}
