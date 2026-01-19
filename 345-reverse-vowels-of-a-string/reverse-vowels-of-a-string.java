import java.util.*;

class Solution
{
	
    public static String reverseVowels(String s) 
    {
        int left=0;
        char c[]=new char[s.length()];
        int right=c.length-1;
        for(int i=0;i<s.length();i++)
        {
            c[i]=s.charAt(i);
        }
        while(left<right)
        {
            if((c[left]=='a' || c[left]=='A'||c[left]=='e' || c[left]=='E'||c[left]=='i' || c[left]=='I'||c[left]=='o' || c[left]=='O'||c[left]=='u'|| c[left]=='U')&&(c[right]=='A'||c[right]=='a'||c[right]=='E'||c[right]=='e'||c[right]=='I'||c[right]=='i'||c[right]=='O'||c[right]=='o'||c[right]=='U'||c[right]=='u'))
            {
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                
				
            left++;
            right--;
            }
			else if((c[left]!='A'||c[left]!='a'||c[left]!='E'||c[left]!='e'||c[left]!='I'||c[left]!='i'||c[left]!='O'||c[left]!='o'||c[left]!='U'||c[left]!='u')&&(c[right]=='A'||c[right]=='a'||c[right]=='E'||c[right]=='e'||c[right]=='I'||c[right]=='i'||c[right]=='O'||c[right]=='o'||c[right]=='U'||c[right]=='u'))
			{
				left++;
			}
			else
			{
				right--;
			}
        }
        String str=String.valueOf(c);
         return str;
    }
}