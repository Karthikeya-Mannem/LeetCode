import java.util.Stack;
class MyQueue {
    private Stack<Integer>s1 = new Stack<>();
    private Stack<Integer>s2 = new Stack<>();

    public MyQueue() {

    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            s1tos2();
        }
        int poppedelement = s2.pop();
        return poppedelement;
    }
    
    public int peek() {
        if(s2.isEmpty()){
            s1tos2();
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    private void s1tos2(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
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