class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] cht=t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(cht);

        if(ch.length!=cht.length)
        return false;

        boolean bool=true;

        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==cht[i])
            {
            //     System.out.println("ch:"+ch[i]);
            // System.out.println("cht:"+cht[i]);
            bool=true;
            }
            
            else 
            {
                bool=false;
                break;
            }
            
            
        }
        return bool;
        
    }
}