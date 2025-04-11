import java.util.Arrays;

/**
 * O(nlogn)
 * The following"
 * 1. Splitting
 * 2. merge
 */

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        if(l <r){
            int mid = (l+r)/2;
            mergeSort(arr, l,mid);
            mergeSort(arr, mid+1,r);
            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] tempArray = new int[r-l+1];
        int leftSlot = l;
        int rightSlot = mid+1;
        int k=0;
        while(leftSlot <= mid && rightSlot <= r){
            if (arr[leftSlot] < arr[rightSlot]) {
                tempArray[k] = arr[leftSlot];
                leftSlot++;
            } else{
                tempArray[k] = arr[rightSlot];
                rightSlot++;
            }
            k++;
        }
        while(leftSlot <= mid){
            tempArray[k] = arr[leftSlot];
            leftSlot++;
            k++;
        }
        while(rightSlot <= r){
            tempArray[k] = arr[rightSlot];
            rightSlot++;
            k++;
        }

        for(int i=0; i < tempArray.length; i++){
            arr[l+i] = tempArray[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {34,56,3,23,66,5,1};
        mergeSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
