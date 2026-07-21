class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long ans=0;

        while(n!=0)
        {
            long d=n%10;
            sum+=d;
            if(d!=0)
            {
            ans=ans*10+d;
            
            }
            n=n/10;


        }
        long r=0;
        while(ans!=0)
        {
            long d=ans%10;
            r=r*10+d;
            ans=ans/10;
        }
        return sum*r;
    }
}