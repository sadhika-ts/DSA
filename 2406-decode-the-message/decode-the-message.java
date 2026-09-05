class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character,Character> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        String[] str=key.split(" ");
        int ascii=97;

        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                char c=(char)ascii;
                if(!map.containsKey((str[i].charAt(j))))
                {
                    map.put(str[i].charAt(j),c);
                    System.out.println(str[i].charAt(j)+" "+c);
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