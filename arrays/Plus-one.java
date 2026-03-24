// Problem : Plus one
// Platform : Leetcode
// Topic : Arrays
// Difficulty : Easy
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){   // Simply add 1 if digit is  less than 9
               digits[i]+=1;
               return digits;
            }
            if(digits[i]==9){ // if digit==9 then convert number to zero
              digits[i]=0;
            
            }
            
        }  int [] newarr =  new int[digits.length+1]; // if all digits are 9, create new array and assign first poition with 1
            newarr[0]=1;
            return newarr;
    }
}
