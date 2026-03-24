// Problem : Square of sorted array in java 
// PLatform : Leetcode
// Topic : Array
// Difficulty : easy
// NOTE : THIS IS NOT OPTIMAL APPROACH,this has O(n^2) time complexity, better approach is two pointers, will implement that next.
// (approach 1)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int square[] = new int[nums.length];
        for(int i=0;i<square.length;i++){
             square[i] = nums[i]*nums[i];
        }
        for(int i=0;i<square.length;i++){
            for(int j=0 ; j<square.length-i-1;j++){
                if(square[j]>square[j+1]){
                    int max = square[j];
                    square[j]= square[j+1];
                    square[j+1]= max;
                }
            }
        }
      return square;
    }
}
