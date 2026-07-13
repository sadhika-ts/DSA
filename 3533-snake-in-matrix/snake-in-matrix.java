class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int i=0;
        int j=0;

        for(int k=0;k<commands.size();k++)
        {
            switch(commands.get(k))
            {
                case "RIGHT":
                j++;
                break;

                case "DOWN":
                i++;
                break;

                case "UP":
                i--;
                break;

                case "LEFT":
                j--;
                break;
            }
        }
        return ((i*n)+j);

        
    }
}