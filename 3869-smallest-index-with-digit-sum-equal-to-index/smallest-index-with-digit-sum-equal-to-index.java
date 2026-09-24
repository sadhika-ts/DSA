class Solution {
    public int smallestIndex(int[] nums) {

        int min=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int n=nums[i];

            while(n!=0)
            {
                int d=n%10;
                sum+=d;
                n=n/10;
            }

            if(sum==i)
            {
                min=i;
                break;
            }
            else
            {
                min=-1;
            }


        }
        return min;
        
    }
}