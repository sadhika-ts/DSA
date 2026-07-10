class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;

            if(i>0 && nums[i]==nums[i-1]) continue;

            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0)
                k--;
                else if(sum<0)
                j++;
                else
                {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    
                    j++;
                    k--;
                    while(nums[j]==nums[j-1] && j<k) j++;
                    while(nums[k]==nums[k+1] && j<k) k--;
                }
            }
        }

        
       
        

        // Set<Integer> set=new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     set.clear();
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         int temp=-(nums[i]+nums[j]);
        //         if(!set.contains(temp))
        //         {
        //             set.add(nums[j]);
                    
        //         }
        //         else{
              
        //             List<Integer> t=Arrays.asList(nums[i],nums[j],temp);    
        //             Collections.sort(t);
        //             if(!list.contains(t))
        //             list.add(t);  
        //         }             

        //     }
        // }

        


        return list;
        
    }
}