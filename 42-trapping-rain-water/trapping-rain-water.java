class Solution {
    public int trap(int[] height) {

        int[] prefixmax=new int[height.length];
        int[] suffixmax=new int[height.length];

        prefixmax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            prefixmax[i]=Math.max(prefixmax[i-1],height[i]);
        }

        suffixmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            suffixmax[i]=Math.max(suffixmax[i+1],height[i]);
        }

        int total=0;
        for(int i=0;i<height.length;i++)        
        {
            int leftmax=prefixmax[i];
            int rightmax=suffixmax[i];
            if(leftmax > 0 && rightmax > 0)
            {
                total+=Math.min(leftmax,rightmax)-height[i];
            }
        }

        return total;

        
    }
}