class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
     {
        int maxsum=0;
        int i=0;
        int j=0;
        int n=nums.length;
        int max=0;
        while(i<n && j<n)
        {
            if(nums[j]==1)
            {
                j++;
                max=j-i;
                maxsum=Math.max(maxsum,max);                
            }
            else
            {
                j++;
                i=j;
            }
        }
        
      
        
         return maxsum;
    }
}