class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack=new LinkedList<>();
        String[] paths=path.split("/");
        for(int i=0;i<paths.length;i++){
            if(paths[i].trim().equals("") || paths[i].equals(".")){
                continue;
            }else if(paths[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                    if(stack.peek().equals("/")){
                        stack.pop();              
                    }
                }
            }else{
                stack.push("/");
                stack.push(paths[i]);
            }
        }
        if(stack.isEmpty()){
            stack.push("/");
        }
        ArrayList<String> as=new ArrayList<>();
        while(!stack.isEmpty()){
            as.add(stack.pop());
        }
        Collections.reverse(as);
        String res="";
        for(int i=0;i<as.size();i++){
            res+=as.get(i);
        }

        return res;

    }
}
