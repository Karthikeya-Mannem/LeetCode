import java.util.Queue;
import java.util.LinkedList;
class MyStack {
    private Queue<Integer>q1;
    private Queue<Integer>q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.peek());
            q2.poll();
        }
    }
    
    public int pop() {
        int poppedelement = q1.peek();
        q1.poll();
        return poppedelement;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */