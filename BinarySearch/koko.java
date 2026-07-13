class Solution { 
    public int help(int piles[] , int mid){ //helper func
        int total =0;
     for(int i=0;i<piles.length;i++){
     total +=  Math.ceil((double)piles[i]/mid);
     } 
     return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max =piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
      int low = 1;
      int high = max;
      while(low<=high){
        int mid = low + (high-low)/2;
        int hours = help(piles,mid); //calling the helper func
        if(hours<=h){
           high = mid-1; //Means koko can eat slower, so move left
        }
        else{
           low = mid+1;
        }
      }
      return low;
    }
}
