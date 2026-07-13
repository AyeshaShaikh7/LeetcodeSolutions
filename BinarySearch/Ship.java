class Solution {
    public int helper(int mid, int weights[]){
        int sum =0;
        int dayc=1;
        for(int i=0;i<weights.length;i++){
         if(sum + weights[i] <= mid){ //Do +weight here to check first if by adding weight[i] we are <= mid 
                                      //only then adding it in sum
            sum += weights[i];
         }
         else{
            dayc++;
            sum = weights[i]; //resetting sum to the weight that cannot be added in sum
         }
        }
        return dayc;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int max =0;
        int sum =0;
        for(int i =0;i<weights.length;i++){
            if(weights[i]>max){
                max = weights[i];
            }
            sum += weights[i];
        }
       int low = max; //ship capacity.We can't have a capacity smaller than the heaviest package
      int high = sum; //With this capacity, all packages can be shipped in one day,
       int ans = 0; 
       while(low<=high){
        int mid = low + (high-low)/2;
        int wcd = helper(mid,weights);
        if( wcd <= days){
        ans = mid;
        high = mid-1;
        }
        else{
            low = mid+1;
        }
       }
       return ans;
    }
}
