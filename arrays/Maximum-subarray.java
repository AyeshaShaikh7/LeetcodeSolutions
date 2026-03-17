// Problem : Maximum Subarray
// Platform : Leetcode
// Topic : Arrays
// Difficulty : Easy
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0; int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum>maxsum){ 
                maxsum = sum; // negative sum can also be maxsum ,so 1st this condition is checked
            }
            if(sum<0){ // if sum is already negative reset it to zero FOR FUTURE
                sum=0;
            }
            
        } return maxsum;
    }
}
