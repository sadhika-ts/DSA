class Solution {
    public String reverseVowels(String s) {
         
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }        
        while(i<j)
        {
            if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u' && arr[i]!='A' && 
            arr[i]!='I' && arr[i]!='E' && arr[i]!='O' && arr[i]!='U')
            {
                i++;
            }
            else if(arr[j]!='a' && arr[j]!='e' && arr[j]!='i' && arr[j]!='o' && arr[j]!='u' && arr[j]!='A' && arr[j]!='I' && arr[j]!='E' && arr[j]!='O' && arr[j]!='U')
            {
                j--;
            }
            else
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
        }
        return String.valueOf(arr);
    }
}
