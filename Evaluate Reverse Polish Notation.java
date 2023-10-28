class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int result;
        int num1;
        int num2;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                 num1=stack.pop();
                 num2=stack.pop();
                 result=num1+num2;
                 stack.push(result);
            }else if(tokens[i].equals("*")){
                 num1=stack.pop();
                 num2=stack.pop();
                 result=num1*num2;
                 stack.push(result);
            }else if(tokens[i].equals("/")){
                 num1=stack.pop();
                 num2=stack.pop();
                 result=num2/num1;
                 stack.push(result);
            }else if(tokens[i].equals("-")){
                 num1=stack.pop();
                 num2=stack.pop();
                 result=num2-num1;
                 stack.push(result);
            }else{
                stack.push(Integer.parseInt(tokens[i])); 
            }
        }
        return stack.pop();
    }
}
