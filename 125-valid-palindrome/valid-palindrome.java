class Solution {
    public boolean isPalindrome(String s) {
        
        // int count=0;
        s=s.toLowerCase();

        

        int left=0;
        int right=s.length()-1;

        while(left<right)
        {
            if(!Character.isLetterOrDigit(s.charAt(left)))
            left++;
            else if(!Character.isLetterOrDigit(s.charAt(right)))
            right--;
            else if(s.charAt(left)==s.charAt(right))
            {
                
                left++;
                right--;
            }
            else
            return false;
        }
        return true;


        // StringBuilder org=new StringBuilder();

        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(Character.isLetterOrDigit(ch))
        //     {
        //         org.append(ch);
        //     }
        // }
        

        // int left=0,right=org.length()-1;

        // while(left<right)
        // {
        //     if(org.charAt(left)==org.charAt(right))
        //     {
        //         left++;
        //         right--;
        //     }
        //     else
        //     {
        //         return false;

        //     }
        // }
        // return true;

        

        
       
        
    }
}