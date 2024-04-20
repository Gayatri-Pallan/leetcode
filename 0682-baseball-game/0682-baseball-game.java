class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String curElement: operations){
            if(curElement.equals("+")){
                int preOne = st.pop();
                int preTwo = st.peek();
                int addition = preOne + preTwo;
                st.add(preOne);
                st.add(addition);
            }
            else if(curElement.equals("C")){
                st.pop();
            }
            else if(curElement.equals("D")){
                int last = st.pop();
                int twice = last*2;
                st.add(last);
                st.add(twice);
            }
            else{
                int num = Integer.parseInt(curElement);
                st.add(num);
            }
        }

        int ans = 0;
        for(int i: st) ans = ans+i;

        return ans;
        
    }
}