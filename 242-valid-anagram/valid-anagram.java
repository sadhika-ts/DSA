class Solution {
    public boolean isAnagram(String s, String t) {
         boolean bool=true;

         int[] arr=new int[128];
         if(s.length()!=t.length()) return false;
         else
         {
            
            for(int i=0;i<s.length();i++)
            {
                int ascii=(int)s.charAt(i);
                arr[ascii]+=1;
                System.out.println(ascii);
            }
            for(int i=0;i<t.length();i++)
            {
                int ascii=(int)t.charAt(i);
                arr[ascii]-=1;

            }

            for(int i=97;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    bool=false;
                    break;
                }
                
            }
         }



    //     char[] ch=s.toCharArray();
    //     char[] cht=t.toCharArray();

    //     Arrays.sort(ch);
    //     Arrays.sort(cht);

    //     if(ch.length!=cht.length)
    //     return false;

    

    //     for(int i=0;i<ch.length;i++)
    //     {
    //         if(ch[i]==cht[i])
    //         {
    //         //     System.out.println("ch:"+ch[i]);
    //         // System.out.println("cht:"+cht[i]);
    //         bool=true;
    //         }
            
    //         else 
    //         {
    //             bool=false;
    //             break;
    //         }
            
            
    //     }
        return bool;
        
    }
}