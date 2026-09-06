class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        int j=0;

        while(min<max && j<nums.length)
        {
            if(nums[j]!=min)
            {
                list.add(min);
                min++;

            }
            else
            {
                min++;
                j++;
            }
            
        }

        

       
        return list;
    }
}