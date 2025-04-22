import java.util.Arrays;

public class Example1MinMaxInArray {
    public static int[] findMaxAndMin(int[] numbers) {
        // Write your code here
        int[] result = new int[2];
        if(numbers == null || numbers.length == 0){
            return new int[]{0,0};
        } else {
            result[0]=numbers[0];
            result[1]=numbers[0];
        }
        for(int i=0; i< numbers.length; i++){
            if(result[0] > numbers[i]){
                result[0] = numbers[i];
            }
            if(result[1] < numbers[i]){
                result[1] = numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 1, 5, 3, 6, 4};
        Arrays.stream(findMaxAndMin(numbers)).forEach(System.out::println);
    }
}
