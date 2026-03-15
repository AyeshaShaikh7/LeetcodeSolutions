// Problem : Remove duplicates from sorted array
// Platform : Leetcode
// Topic : Array, Two pointer
// Difficulty : easy 
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            
                if(nums[k]!=nums[i]){
                    nums[k+1] = nums[i];
                    k=k+1;
                   
                } 
                
            
        } return k+1;
    }
}
