class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<>();

        if(s.length()==1 || s.length()%2!=0)
        return false;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                if(s.charAt(i)=='(')
                st.push('(');
                else if(s.charAt(i)=='{')
                st.push('{');
                else
                st.push('[');

            }
            else
            {
                if(st.isEmpty())
                return false;
               char top=st.peek();
               if(top=='(' && s.charAt(i)==')')
               st.pop();
               else if(top=='{' && s.charAt(i)=='}')
               st.pop();
               else if(top=='[' && s.charAt(i)==']')
               st.pop();
               else
               return false;


            }
        }
        
        if(st.isEmpty())
        return true;
        else
        return false;
        
    }
}