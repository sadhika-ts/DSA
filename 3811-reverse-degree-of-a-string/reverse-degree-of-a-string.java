class Solution {
    public int reverseDegree(String s) {
        int prod=1;
        int sum=0;

        for(int i=0;i<s.length();i++)
        {
            int ascii=123-((int)(s.charAt(i)));
            prod*=ascii*(i+1);
            sum+=prod;
            prod=1;

        }
        return sum;
        
    }
}