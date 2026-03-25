//Problem : Maximum consecutive 1s
// Platform : Leetcode
// Topic : Arrays
// Difficulty : Easy
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0; int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count ++;
                if(count>maxcount){
                maxcount =count;    // seperate maxcount variable to store max no. of consecutive 1
                }
            } else{
                count =0;         
                // if we include maxcount=count here, it resets maxcount and count to 0,               
                //  but we want maxcount to store max consecutive 1 not reset.
                
            }
        }
        return maxcount;
    }
}
