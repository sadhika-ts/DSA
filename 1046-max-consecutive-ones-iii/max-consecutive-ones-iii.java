class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int max=0;
        int maxsum=0;
        int count=k;
        int n=nums.length;
        
        int i=0;

        int j=0;

            while(i<n && j<n)
            {
                if(nums[j]==1)
                {
                    j++;
                    max=j-i;
                    maxsum=Math.max(max,maxsum);
                }
                else
                {
                    

                    if(count>0)
                    {
                        j++;
                        max=j-i;
                        maxsum=Math.max(max,maxsum);
                        count--;
                    }
                    else
                    {
                        count=k;
                        i++;
                        j=i;
                    }

                }
                
            }
            
        
        return maxsum;
    }
}