
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int x=0, y=0,z =0;
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                    x = s.pop();
                     y = s.pop();
                    z = x+y;
                   
                    s.push(z);

                }
            else if(tokens[i].equals("-")){
                     x = s.pop();
                     y = s.pop();
                    z = y-x;
                    s.push(z);
                }
            else if(tokens[i].equals("*")){
                     x = s.pop();
                    y = s.pop();
                     z = x*y;
                    s.push(z);
                }
            else if(tokens[i].equals("/")){
                     x = s.pop();
                    y = s.pop();
                     z = y/x;
                    s.push(z);}
            else{
                    z = Integer.parseInt(tokens[i]);
                s.push(z);
                /*token is 
                     x = s.pop();
                     y = s.pop();
                    if(x == 0) s.push(0);
                    
                    else{ z = y/x;
                    s.push(z);*/
                }
            
        }
     return s.pop();
       
    }
     
}





















/*class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0 || tokens == null)
            return -1;
        Stack<Integer> stack = new Stack<>();
        for(String i : tokens){
            if(i.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if(i.equals("-")){
                int y = stack.pop();
                int x = stack.pop();
                stack.push( x-y );
            } 
            else if(i.equals("*"))
                stack.push(stack.pop() * stack.pop()); 
            else if(i.equals("/")){
                int y = stack.pop();
                int x = stack.pop();
                stack.push( x/y );  
            } 
            else
                stack.push(Integer.valueOf(i));
        }
        return stack.pop();

    }
}*/