class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur =s.charAt(i);
            if(cur=='{' || cur=='(' || cur=='['){
                st.add(cur);
            }
            else{
                if(st.isEmpty())return false;
                char close = st.pop();
                if(cur == '}'){
                    if(close!='{')return false;
                }
                else if(cur == ']'){
                    if(close!='[')return false;
                }
                else{
                    if(close!='(')return false;
                }
            }
        }
        if(st.isEmpty())return true;
        else return false;

    }
}