class Solution {
    public boolean hasAlternatingBits(int n) {

        List<Integer> bool=new ArrayList<>();
        boolean b=true;;
        while(n!=0)
        {
            int d=n%2;
            bool.add(d);          
            
            n=n/2;
            
        }

        int left=0;
        int right=1;

        while(left<right && right<bool.size())
        {
            if(bool.get(left)!=bool.get(right))
            {
               left=right;
               right++;
               
            }
            else
            {
               b=false;
                return b;

            }
        }

        return b;
     
    }
}