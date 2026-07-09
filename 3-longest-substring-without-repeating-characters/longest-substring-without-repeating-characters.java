class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set=new HashSet<>();
        // int left=0;
        // int max=0;

        // for(int right=0;right<s.length();right++)
        // {
        //     while(set.contains(s.charAt(right)))
        //     {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     max=Math.max(max,right-left+1);
        // }
        // return max;

        int freq[] =new int[256];
        int left=0;
        int max=0;
        
        for(int right=0;right<s.length();right++)
        {
            while(freq[s.charAt(right)]>0)
            {
                freq[s.charAt(left)]--;
                left++;
            }
            freq[s.charAt(right)]++;
            max=Math.max(max,right-left+1);
        }
        return max;



    }
}