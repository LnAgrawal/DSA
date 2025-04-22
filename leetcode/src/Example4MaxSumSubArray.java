import java.util.function.Predicate;

public class Example4MaxSumSubArray {
    public static int getMaxSumOfArray(int[] arr){
        int currentMax= 0;
        int maxSoFar= Integer.MIN_VALUE;

        for(int i=0; i < arr.length;i++){
            currentMax += arr[i];

            if(currentMax > maxSoFar){
                maxSoFar = currentMax;
            }
            if(currentMax < 0){
                currentMax = 0;
            }


        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr = {-5, -1, -8, -9};//{34, -50, 42, 14, -5, 86};
        System.out.println(getMaxSumOfArray(arr));
        Predicate<Integer> p = I -> I>10;

        System.out.println(p.negate().test(5));

    }
}
