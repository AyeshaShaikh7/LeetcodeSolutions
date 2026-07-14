class Solution {
    public int splitArray(int[] nums, int k) {
        int sum =0;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
        sum += nums[i];
        if(nums[i]>max){
            max = nums[i];
        }
        }
        int low = max; //No subarray can have a sum smaller than the maximum element.
        int high = sum; // If we don't split the array at all, the entire array forms one subarray, which can be highest ans
        while(low<=high){
            int mid = low+ (high - low)/2;
            int splitc = Splitc(nums,mid);
            if(splitc<=k){
            high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public int Splitc(int nums[], int mid){
        int sum = 0;
         int splitc = 1;
        for(int i =0;i<nums.length;i++){
            if(sum+nums[i] <= mid){ //same logic as that of bouquet of checking before adding to sum
                sum += nums[i];
            }
            else{
                splitc++; // We cannot include the current element in this subarray, so create a new one.
                sum = nums[i];
            }
        }
        return splitc;
    }
}
