class Solution {
    public int secondHighest(String s) 
    {
        
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            int j=s.charAt(i)-'0';
            if(j>=0 && j<=9)
            if(l.contains(j)==false)
            l.add(j);
            

        }
        Collections.sort(l);
        if(l.size()==1 || l.isEmpty())
        return -1;
        
        return l.get(l.size()-2);
    
    }
}