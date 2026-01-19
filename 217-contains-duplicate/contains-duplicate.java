import java.util.*;


import java.util.*;
class Solution {
    public static boolean containsDuplicate(int[] nums)
    {
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
             return true;
            
            
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=s.nextInt();
        }
        boolean contains=containsDuplicate(nums);
        System.out.println(contains);
    }
}