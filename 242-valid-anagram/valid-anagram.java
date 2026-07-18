class Solution {
    public boolean isAnagram(String s, String t) {
         
         

         int[] arr=new int[26];
         if(s.length()!=t.length()) return false;
         else
         {
            
            for(int i=0;i<s.length();i++)
            {
                // int ascii=(int)s.charAt(i);
                arr[(int)s.charAt(i)-97]+=1;
                
            }
            for(int i=0;i<t.length();i++)
            {
                int ascii=(int)t.charAt(i);
                arr[ascii-97]-=1;

            }

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    return false;
                    
                }
                
            }
         }

        return true;
        
    }
}