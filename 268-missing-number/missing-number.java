import java.util.*;

class Solution {
    public static int missingNumber(int[] nums) 
    {
		
		
		int n=nums.length;
        int missingnumber=0;
		int size=n*(n+1)/2;
		
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum=sum+nums[i];			
		}
		missingnumber=size-sum;
		
		return missingnumber;
    }
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] nums=new int[size];

        for(int i=0;i<size;i++)
        {
            nums[i]=s.nextInt();
        }
        int missingnumber=missingNumber(nums);
        System.out.println(missingnumber);

    }
}