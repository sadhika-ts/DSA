class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character,Character> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        
        int ascii=97;

       
            for(int j=0;j<key.length();j++)
            {
                if(key.charAt(j)!=' ')
                {
                    char c=(char)ascii;
                    if(!map.containsKey((key.charAt(j))))
                    {
                        map.put(key.charAt(j),c);
                        ascii++;
                    }
                }                
                
            }
        

        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            sb.append(" ");
            else
            {
                char ch=map.get(message.charAt(i));
                sb.append(ch);
            }
            
        }
        
        

        return sb.toString();
    
        
    }
}