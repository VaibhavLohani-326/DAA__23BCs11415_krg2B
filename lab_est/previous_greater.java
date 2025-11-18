class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                list.add( st.peek());
                
            }
            else{
                list.add(-1);
            }
            st.push(arr[i]);
        }
        return list;
        
    }
}
