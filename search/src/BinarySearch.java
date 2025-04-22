public class BinarySearch {
    public static int binarySeach(int arr[], int min, int max, int x){

        while(min <=max){
          int mid = (min+max) /2;
            System.out.println("min: "+ min + " mid: "+mid + " max"+ max);
          if(x== arr[mid])
              return mid;
          if(x < arr[mid])
          {
              max = mid-1;
          } else {
              min = mid+1;
          }
        }
        return -1;
    }
    public static int binarySeachRecursive(int arr[], int min, int max, int x){
            int mid = (min+max) /2;
            System.out.println("min: "+ min + " mid: "+mid + " max"+ max);
            if(min >max) {
                return -1;
            }
            if(x== arr[mid])
                return mid;
            if(x < arr[mid])
            {
                return binarySeachRecursive(arr, min, mid-1, x);
            } else {
               return  binarySeachRecursive(arr, mid+1, max, x);
            }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(binarySeach(arr, 0, arr.length-1, 5));
        System.out.println(binarySeachRecursive(arr, 0, arr.length-1, 5));
    }

}
