class Solution {
     public int jump(int[] nums) {
        
         if(nums.length == 1)
             return 0;
         
         
       int count=0;
       int elementIndex=0;
        int startIndex = elementIndex+1;
         int stopIndex = elementIndex+nums[elementIndex];
         int trace =0;
         int indexWanted=0;
         //if 
         while(startIndex <= stopIndex)
         {
             if(startIndex == (nums.length-1))
             {
                 count++;
                 return count;
             }
             int value = nums[startIndex]+startIndex;
             if(value > trace)
             {
                 trace= value;
                 indexWanted = startIndex;
            }
             if(startIndex == stopIndex)
            {
                count++;
                elementIndex=indexWanted;
                startIndex=indexWanted+1;
                stopIndex= elementIndex+nums[elementIndex];
                trace=0;
                indexWanted=0;
            }
             else
             {
                 startIndex++;
             }
            
         
         }
          
            
         
        
        
        
        
        
        
        return count;
        
    }
}