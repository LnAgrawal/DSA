import java.util.Arrays;

/**
 * Big O notaqtion: O(n^2)
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr){

        for(int i=0; i< arr.length; i++){
            int min = i;
            for(int j=i; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {34,56,23,66,5};
        //System.out.println(selectionSort(arr));
        Arrays.stream(selectionSort(arr)).forEach(System.out::println);
    }
}
