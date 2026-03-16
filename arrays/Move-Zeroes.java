// Problem : Move Zeroes
// Platform : Leetcode
// Topic : Arrays
// Difficulty : Easy
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){ // Loop1 puts all non zero elements before
            if(nums[i]!=0){
            nums[k]=nums[i];
            k++;
            }
        } while(k<nums.length){ // Loop2 puts/fills remaining positions/places with zero
            nums[k]=0;
            k++;
        }
        
    }
}
