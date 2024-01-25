package data_structure.stack;

public class Stack {
    private int[] stack;
    private int pop_value;
    private int top;  // stack 최상단 위치

    public Stack(int num){
        this.stack = new int[num] ;
    }
    public void push(int num){
        stack[top++] = num;
    }
    public int pop(){
        pop_value = stack[top-1];
        top--;
        return pop_value;
    }
    public int peek(){
        return stack[top-1];
    }
}
