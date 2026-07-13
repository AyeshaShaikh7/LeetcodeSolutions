class Solution {
      public int helper(int mid, int bloomDay[], int k){ //helper func
        int bouquetc =0;
        int flowerc =0;
       for(int i=0;i<bloomDay.length;i++){
       if(bloomDay[i]<=mid){ 
        flowerc ++;
       }
       else{
        flowerc = 0;
       }
       if(flowerc == k){ //if we reach flowerc to k(how many flowers we want in one bouquet, we increase bouquetc and reset flowerc
        bouquetc++;
        flowerc =0;
       }
       }
       return bouquetc;
    }
    public int minDays(int bloomDay[], int m, int k) {
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        for(int i =0;i<bloomDay.length;i++){
            if(bloomDay[i] > max){
                max = bloomDay[i];
            }
            if(bloomDay[i] < min){
                min = bloomDay[i];
            }
        }
      int low = min; // Minimum day any flower blooms, so the answer cannot be smaller than this.
      int high = max; // Maximum day any flower blooms. By this day, all flowers have bloomed,
                      // so if it's possible to make m bouquets, it must be possible by now.
      int ans =-1;
      while(low<=high){
        int mid = low + (high-low)/2;
        int days = helper(mid,bloomDay,k);
        if(days>=m){  // Enough bouquets, search for a smaller day.
            ans = mid;
            high = mid-1;
        }
        else{
            low = mid+1;  // Not enough bouquets, need more days.
        }
      }
      return ans;
    }
}
