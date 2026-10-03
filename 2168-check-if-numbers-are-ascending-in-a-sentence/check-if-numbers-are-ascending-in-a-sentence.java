class Solution {
    public boolean areNumbersAscending(String s) {

        String[] str=s.split(" ");
        List<Integer> list=new ArrayList<>();

        boolean bool=false;

        for(int i=0;i<str.length;i++)
        {
            if(str[i].matches("\\d+"))
            {
                list.add(Integer.parseInt(str[i]));
            }
        }

        for(int i=1;i<list.size();i++)
        {
            if(list.get(i-1)<list.get(i))
            bool=true;
            else
            {
                bool=false;
                break;
            }
        }
        return bool;

        
    }
}