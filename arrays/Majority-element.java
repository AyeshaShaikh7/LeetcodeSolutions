// Problem : Majority element
// Platform : Leetcode
// Topic : Array
// Difficulty : Easy
// Consider voting approach
class Solution {
    public int majorityElement(int[] nums) {
        int count =0; int maj= nums[0];
        for(int i=0;i<nums.length;i++){
          if(nums[i]==maj){
            count ++;
          } else{
                count --; // If we didn’t decrement, the candidate would seem too strong. 
            }
          if(count==0){
            maj = nums[i];
            count =1; // if count becomes zero then we have new candidate is maj so immediately make count to 1
          }
        }
        return maj;
    }
}
