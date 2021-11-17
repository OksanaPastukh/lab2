package lab2.task2;

public class Task2 {
    public static void main(final String[] args) {
        final Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.clear();
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        System.out.println(myStack.getTopValue() + "\n");
        for(final Integer value : myStack){
            System.out.println(value);
        }
        myStack.push(9);
        System.out.println();
        for(final Integer value : myStack){
            System.out.println(value);
        }
    }
}
