class Solution {
    public String discountPrices(String sentence, int discount) {

        String[] str=sentence.split(" ");


        for(int i=0;i<str.length;i++)
        {
            double n=0;
           if(str[i].startsWith("$") && str[i].length() > 1 && str[i].substring(1).matches("\\d+"))
            {
                 for(int j=1;j<str[i].length();j++)
                {
                    if(Character.isDigit(str[i].charAt(j)))
                    {
                        n=n*10+(str[i].charAt(j)-'0');
                        
                    }
                    else
                    {
                        
                        break;

                    }
                }
                double d=n*discount/100;
                double fl=n-d;
                
                str[i]="$"+String.format("%.2f", fl);

            }
           
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length-1;i++)
        {
            sb.append(str[i]);
            sb.append(" ");

        }
        sb.append(str[str.length-1]);

        return sb.toString();
    }
}