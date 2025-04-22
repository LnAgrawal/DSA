public class Example6EqualsAndDivisiblePairInArray {
    public static int countPairs(int[] nums, int k) {
        int result =0;

        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        System.out.println(countPairs(arr,7)); //18
    }
}
