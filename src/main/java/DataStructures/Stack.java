package DataStructures;

public class Stack {

    private int[]array;
    private int top;
    private int capacity;

    public Stack(int capacity){
        array = new int[capacity];
        this.capacity = capacity;
        this.top = -1; //-1 Because we have add any elements to array yet
    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is Full");
        }
        array[++top] = item; //pre increment top
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--]; //Post increment
    }

    public int peek(){
        return array[top];
    }

    private boolean isFull(){
       return  top == capacity -1;
    }

    private boolean isEmpty(){
        return top == -1;
    }

}
