public class Stack<T> {
    public StackNode<T> tail;
    public int size;
    public int maxSize;

    public Stack(int a){
        int maxSize = a;
    }

    private class StackNode<T>{
        private T element;
        private StackNode<T> previous;

        private StackNode(T newElement, StackNode previous){
            this.previous = previous;
            this.element = newElement;
        }

    }

    public void push(T newValue){
        if (size > maxSize){
            throw new StackOverflowError("Stack Overflow");
        }
        else {
            this.tail = new StackNode<>(newValue, tail);
            size += 1;
        }
    }

    public T pop(){
        if (tail == null){
            throw new IllegalStateException("Empty Stack");
        }
        T value = this.tail.element;
        this.tail = this.tail.previous;
        size -= 1;
        return value;
    }

    public int getSize(){
        return size;
    }
}


