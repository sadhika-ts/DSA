class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] alphabets=new char[26];
        int alpha=97;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<26;i++)
        {
            alphabets[i]=(char)(alpha+25-i);
        }
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            
            int sum=0;
            for(int j=0;j<str.length();j++)
            {
                           
                int ascii=(int)str.charAt(j);
                sum+=weights[ascii-97];
                            
            }
            int mod=sum%26;
            sb.append(alphabets[mod]);
            

        }
        return sb.toString();

    }
}