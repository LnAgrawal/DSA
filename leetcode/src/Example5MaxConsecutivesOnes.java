public class Example5MaxConsecutivesOnes {
    public static int longestOnes1(int[] nums, int k) {
        int max =0, start=0, zeroCounter=0;
        for(int end=0; end < nums.length; end++){
            if(nums[end] == 0){
                zeroCounter++;
            }
            while(zeroCounter > k){
                if(nums[start]==0) {
                    zeroCounter--;
                }
                start++;
            }
            max = Math.max(max, end-start+1);
        }
        return max;
    }
    public static int longestOnes(int[] nums, int k) {
        int flip=k;
        int max =0, currentMax=0, currentZero=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==1){
                currentMax++;
            } else if(nums[i]==0 && flip>0){
                currentMax++;
                flip--;
            }
            else if(k==0){
                currentMax = 0;
            }
            else if(flip ==0){
                int j=currentZero;
                while(j<i && currentMax>0){
                    if(nums[j]==1)
                        currentMax--;
                    else if( nums[j]==0){
                       // currentMax--;
                     //   flip++;
                        currentZero =j+1;
                        break;
                    }
                    j++;
                }
                /*if(flip>0){
                    currentMax++;
                    flip--;
                }*/
            }
            max = Math.max(max,currentMax );
        }
        return max;

    }

    public static void main(String[] args) {
        //int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};

        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(arr, 0));

        System.out.println(longestOnes1(arr, 0));
    }
}
