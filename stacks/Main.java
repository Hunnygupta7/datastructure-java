package datastructures.stacks;

public class Main {
    public static void main(String args[]){
        Stack myStack = new Stack(1);

        //Push
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        //Pop
        myStack.pop();

        // myStack.getTop();
        // myStack.getHeight();

        myStack.printStack();
    }
}
