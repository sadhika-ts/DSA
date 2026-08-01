class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
     {
        int max=0;
        int one=1;
        
        int maxsum=0;

        for(int i=0;i<nums.length;i++)
        {
            if(one==nums[i])
            {
                max=max+1;
            }
            else
            {
                
                maxsum=Math.max(maxsum,max);
                
                max=0;
            }
            
            maxsum=Math.max(maxsum,max);
        }
        
         return maxsum;
    }
}