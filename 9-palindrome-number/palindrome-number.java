class Solution {
    public boolean isPalindrome(int x)
    {
        char[] c=new char[(String.valueOf(x)).length()];
        
        for(int i=0;i<c.length;i++)
        {
            c[i]=String.valueOf(x).charAt(i);
        }
        int left=0;
        int right=c.length-1;
        while(left<right)
        {
            if(c[left]!=c[right])
            return false;
            left++;
            right--;
        }
        // while(left<right)
        // {
        //     char temp=c[left];
        //     c[left]=c[right];
        //     c[right]=temp;
        //     left++;
        //     right--;

        // }        
        // int y=0;

        // for(int i=0;i<c.length;i++)
        // {
        //     int j=c[i]-'0';
        //     y=y*10+j;
        // }
        // if(x==y)
        // return true;

        return true;
        
        
    }
}