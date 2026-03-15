// Problem : Missing number
// Platform : Leetcode
// Topic : Array, Math
// Difficulty : easy

class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length; int sum=0; int sum1=0;
        for(int i=0;i<n;i++){
             sum = sum + nums[i];
        }
        for(int i=0;i<n+1;i++){
         sum1 += i;
        }
        return (sum1-sum);

    }
}
