import java.util.Arrays;

/**
 * Each element from unsorted section of array to sorted section of an array
 */
public class InsertionSort {
    public static int[] insertionSort(int[] a){

        for(int i=1; i< a.length; i++){
            int min = a[i];
            int j = i-1;
            while(j>=0 && a[j]> min){
                //int temp =  a[j+1];
                a[j+1] = a[j];
               // a[j] = temp;
                j--;
            }
            a[j+1] = min;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {34,56,3,23,66,5,1};
        Arrays.stream(insertionSort(arr)).forEach(System.out::println);
    }
}
