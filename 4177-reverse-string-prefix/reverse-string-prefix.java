class Solution {
    public String reversePrefix(String s, int k)
    {
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++)
        c[i]=s.charAt(i);

        int left=0;
        int right=k-1;
        while(left<right)
        {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        String st=String.valueOf(c);
        return st;
    }
}