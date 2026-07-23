class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] answer=new int[arr.length];
        int j=1;
        int[] duplicate=arr.clone();
        Arrays.sort(duplicate);
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(duplicate[i]))
            {
                map.put(duplicate[i],j);
                j++;
            }
           
        }

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            answer[i]=map.get(arr[i]);
        }

        return answer;
        
    }
}