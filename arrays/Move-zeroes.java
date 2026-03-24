// Problem : Move zeroes
// PLatform : Leetcode
// Topic : Array
// Difficulty : Easy
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){ // putting all the non zeroes in front
            if(nums[i]!=0){
            nums[k]=nums[i];
            k++;
            }
        } while(k<nums.length){ // placing or filling remaing last slots with zeroes
            nums[k]=0;
            k++;
        }
        
    }
}
