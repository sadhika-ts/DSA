class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String[] split=s.split(" ");
        for(int i=0;i<k-1;i++)
        {
            sb.append(split[i]);
            sb.append(" ");
        }
        sb.append(split[k-1]);
        return sb.toString();
        
    }
}