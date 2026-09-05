class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int m=nums2.length;

        List<Integer> num1=new ArrayList<>();
        List<Integer> num2=new ArrayList<>();
        List<Integer> list=new ArrayList<>();


        Arrays.sort(nums1);
        Arrays.sort(nums2);


        int i=0;
        num1.add(nums1[0]);
        
        for(int j=1;j<n;j++)
        {
            if(nums1[j]!=nums1[j-1])
            {
                num1.add(nums1[j]);
                
            }
            
        }
        
        num2.add(nums2[0]);
        for(int j=1;j<m;j++)
        {
            if(nums2[j]!=nums2[j-1])
            {
                num2.add(nums2[j]);
                
            }
            
        }
        

        i=0;
        int k=0;
        n=num1.size();
        m=num2.size();

        if(n<m)
        {
            while(i<n)
            {
                if(num2.contains(num1.get(i)))
                {
                    list.add(num1.get(i));

                }
                i++;

            }
          
        }
        else
        {
              while(k<m)
            {
                if(num1.contains(num2.get(k)))
                {
                    list.add(num2.get(k));
                    
                }
                k++;
            }
          
        }
        int[] ans=new int[list.size()];
        k=0;
        for(int a:list)
        {
            ans[k++]=a;
        }
        return ans;
      
    }
}