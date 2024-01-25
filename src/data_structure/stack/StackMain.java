package data_structure.stack;

public class StackMain {
    public static void main(String[] args) {
        int num = 10;
        Stack stack = new Stack(num);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println("pop= " +stack.pop());
        System.out.println(stack.peek());
        System.out.println("pop= " +stack.pop());
        System.out.println(stack.peek());
        System.out.println("pop= " +stack.pop());
        System.out.println(stack.peek());
        System.out.println("pop= " +stack.pop());



    }
}
