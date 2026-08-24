class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=1;i<strs.length;i++)
        {
            String s="";
            if(strs[0].length()<strs[i].length())
            {
                for(int j=0;j<strs[0].length();j++)
                {
                    if(strs[0].charAt(j)==strs[i].charAt(j))
                    s+=strs[i].charAt(j);
                    else
                    break;

                }
            }
            else
            {
                for(int j=0;j<strs[i].length();j++)
                {
                    if(strs[0].charAt(j)==strs[i].charAt(j))
                    s+=strs[i].charAt(j);
                    else
                    break;

                }
            }
            
            strs[0]=s;

        }
        return strs[0];
    }
}