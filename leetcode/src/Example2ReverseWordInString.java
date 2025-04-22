import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example2ReverseWordInString {
    public static void main(String[] args) {
        String s = "a good   example";
        String[] data = s.split("\\s+");
        int len = data.length;
        //java8
         String result = IntStream.range(0, len )
           .mapToObj(i->{
               return data[len-1-i];
           })
           //.filter(f -> !f.isEmpty())
           .collect(Collectors.joining(" "));
        System.out.println(result);

        //natura
        int i =0, j=len-1;
        while(i<j){
            String t = data[i];
            data[i] = data[j];
            data[j]=t;
            i++;
            j--;
        }
        System.out.println(String.join(" ", data));

       // String[] data = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int x=data.length-1; x>=0; x--){
            sb.append(data[x]).append(" ");
        }

    }



}
