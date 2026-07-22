class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack=new Stack<>();

        for(String token:tokens){

            if(token.equals("+") || token.equals("-") || 
                token.equals("*")|| token.equals("/")){

                    int nums1=stack.pop();
                    int nums2=stack.pop();

                    if(token.equals("+")){
                        stack.push(nums1+nums2);
                    }
                    else if(token.equals("-")){
                        stack.push(nums2-nums1);
                    }
                    else if(token.equals("*")){
                        stack.push(nums1*nums2);
                    }
                    else{
                        stack.push(nums2/nums1);
                    }

                    

            }
            else{

                stack.push(Integer.parseInt(token));
            }


        }
        return stack.pop();
    }
}
