class Solution {
    public String restoreString(String s, int[] indices)
    {
        char[] c=new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
            int j=indices[i];
            c[j]=s.charAt(i);
        }
        String st=String.valueOf(c);
        return st;
        
    }
}