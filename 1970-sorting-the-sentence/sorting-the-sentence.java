class Solution {
    public String sortSentence(String s) {

        String[] str=s.split(" ");
        String[] map=new String[str.length];
        

        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                if(Character.isDigit(str[i].charAt(j)))
                {
                    char ch=str[i].charAt(j);
                    
                    
                    

                    int k=str[i].charAt(j)-'0';
                    str[i]=str[i].replace(ch,' ');

                    map[k-1]=str[i];

                    

                }
            }
        }
        
        String st="";

        for(int i=0;i<map.length;i++)
        {
            st=st+map[i];
        }

        return st.trim();
    }
}