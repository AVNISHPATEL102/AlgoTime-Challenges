class Solution {
    public String defangIPaddr(String address) {
        
        String cool ="";
        for(int i =0 ; i<address.length() ; i++)
        {
            if(address.charAt(i) == '.')
                cool+="[.]";
            else
                cool+=address.charAt(i);
        }
        
        return cool;
    }
}