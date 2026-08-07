class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int t = stack1.pop();
                stack2.push(t);
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        if(stack2.isEmpty()){
             while(!stack1.isEmpty()){
                int t = stack1.pop();
                stack2.push(t);
            }
        }return stack2.peek();
    }
    
    
    public boolean empty() {
        if(stack2.isEmpty() && stack1.isEmpty() ){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */