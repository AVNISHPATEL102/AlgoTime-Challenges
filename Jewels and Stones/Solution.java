class Solution {
    
    public static int find(char[] a, char b)
    {
        for(int i =0; i< a.length ; i++)
        {
            if(a[i] == b)
                return i;
        }
        return -1;
    }
    public int numJewelsInStones(String J, String S) {
        int count =0 ;
        char[] Js = J.toCharArray();
        char[] Ss =  S.toCharArray();
        
        for(int i =0 ; i<Ss.length;i++)
        {
            int h = find(Js,Ss[i]);
                if(h>(-1))
                    count++;
        }
        return count;
    
    }
}