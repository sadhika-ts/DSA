class Solution {
    public String trimTrailingVowels(String s) {
        
        StringBuilder sb=new StringBuilder();

        
        int j=s.length()-1;

        while(j>=0)
        {
            if(s.charAt(j)=='a' ||s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' )
            {
                j--;
            }
            else
            break;


        }
        return s.substring(0,j+1);

    }
}