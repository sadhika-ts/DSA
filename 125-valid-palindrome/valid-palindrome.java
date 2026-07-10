class Solution {
    public boolean isPalindrome(String s) {
        
        int count=0;
        s=s.toLowerCase();

        

        // int left=0;
        // int right=sa.length()-1;

        // while(left<right)
        // {
        //     if(!Character.isLetterOrDigit(sa.charAt(left)))
        //     left++;
        //     else if(!Character.isLetterOrDigit(sa.charAt(right)))
        //     right--;
        //     else
        //     {
        //         count++;
        //         left++;
        //         right--;
        //     }
        // }


        StringBuilder org=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                org.append(ch);
            }
        }
        

        int left=0,right=org.length()-1;

        while(left<right)
        {
            if(org.charAt(left)==org.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;

            }
        }
        return true;

        

        
       
        
    }
}