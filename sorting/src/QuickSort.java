import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        if(left<right){
           int mid =  partition(arr, left, right);
            quickSort(arr,left, mid-1);
            quickSort(arr,mid+1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left -1;
        int j= left;
        int pivot = arr[right];

        while(j < right){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        int temp = arr[i+1];
        arr[i+1]= pivot;
        arr[j] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {34,56,3,23,66,5,1};
        quickSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
