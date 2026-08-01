class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
     {
        int max=0;
        int one=1;
        ArrayList<Integer> Max=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(one==nums[i])
            {
                max=max+1;
            }
            else
            {
                Max.add(max);
                
                max=0;
            }
            Max.add(max);
        }
        max=Collections.max(Max);
         return max;
    }
}