class Solution {
    
    public static int god(int[] row,int h)
    {
        for(int i=0;i<row.length;i++)
        {
            if(row[i] == h)
                return i;
        }
        return 0;
    }
    
    
    
    public int minSwapsCouples(int[] row) 
    {
        int count=0;
        for(int i =0 ; i < row.length ; i+=2)
        {
            if((row[i] %2) ==0)
            {
                if(row[i] != (row[i+1] -1))
                {
                    int temp = row[i]+1;
                    int k = god(row,temp);
                    int t=row[i+1];
                    row[i+1]=row[k];
                    row[k]=t;
                    count++;
                }
            }
            else
            {
                if(row[i] != (row[i+1] +1))
                {
                    int temp = row[i]-1;
                    int k = god(row,temp);;
                    int t=row[i+1];
                    row[i+1]=row[k];
                    row[k]=t;
                    count++;
                }
            }
        
            
        }
    return count;
    }
}
