class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // int i=nums1.length-1;
        // int j=nums2.length-1;
        int i=0;
        int j=0;
        double k=0.0;
        List<Integer> list=new ArrayList<>();

        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
            {
                list.add(nums1[i]);
                i++;
            }
            else
            {
                list.add(nums2[j]);
                j++;
            }
        }

        while(i<nums1.length)
        {
            list.add(nums1[i]);
            i++;
        }
       
       while(j<nums2.length)
       {
        list.add(nums2[j]);
        j++;
       }
        for(int l=0;l<list.size();l++)
        System.out.println(list.get(l));

        
        int index=list.size()/2;
        if(list.size()%2==0)
        {
            k=list.get(index-1)+list.get(index);
            System.out.println(k);
            return k/2;
        }
        else
        {
            k=list.get(index);
            System.out.println(k);
            return k;
        }


        // while(i>=0)
        // {
        //     k+=nums1[i];
        //     i--;
        // }
        //  while(j>=0)
        // {
        //     k+=nums2[j];
        //     j--;
        // }
        // int len=nums1.length+nums2.length;
        // return k/(len);

        
    }
}