class Solution {
    public int maxProduct(int n) {
        int max=0;
        int mul=1;

        char[] chararray=String.valueOf(n).toCharArray();
      

        for(int i=0;i<chararray.length;i++)
        {
            for(int j=i+1;j<chararray.length;j++)
            {
                int l=chararray[i]-'0';
                int r=chararray[j]-'0';
                mul=l*r;
                max=Math.max(max,mul);
                mul=1;
            }
            
        }

        return max;

       
    }
}