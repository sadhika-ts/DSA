class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] answer=new int[arr1.length];
        int k=0;
        Arrays.sort(arr1);

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    answer[k]=arr1[j];
                    k++;
                    arr1[j]=-1;
                    
                }
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<answer.length;j++)
            {
                if(arr1[i]!=answer[j] && arr1[i]!=-1 && k<answer.length)
                {
                    answer[k]=arr1[i];
                    arr1[i]=-1;
                    k++;

                }
            }
        }
        return answer;
    }
}