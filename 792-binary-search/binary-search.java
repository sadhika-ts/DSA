class Solution {
    public int search(int[] nums, int target)
     {
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        int val=-1;

        while(left<=right)
        {
            if(nums[mid]==target)
            {
                val=mid;
                return val;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
                mid=(left+right)/2;
            }
            else if(target>nums[mid])
            {
                left=mid+1;
                mid=(left+right)/2;
            }
            else
            {
                return -1;
            }
        }
        return val;
        

        
    }
}