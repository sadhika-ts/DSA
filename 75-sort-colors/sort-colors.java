class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            count0++;
            else if(nums[i]==1)
            count1++;
            else
            count2++;
        }
        int j=0;
        int k=0;
        while(k<count0 && j<nums.length)
        {
            nums[j]=0;
            j++;
            k++;
        }
        
        k=0;
        while(k<count1 && j<nums.length)
        {
            nums[j]=1;
            j++;
            k++;
        }
        k=0;
        while(k<count2 && j<nums.length)
        {
            nums[j]=2;
            j++;
            k++;
        }

    }
}