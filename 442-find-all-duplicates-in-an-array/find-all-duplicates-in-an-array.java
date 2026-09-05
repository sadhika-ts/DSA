class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=1,n=nums.length;
        Arrays.sort(nums);
         while(i<n && j<n)
        {
            if(nums[i]!=nums[j])
            {
                
                i=j;
                j++;
                
            }
            else
            {
                list.add(nums[i]);
                j++;
            }
            

            
        }
        return list;
        
    }
}