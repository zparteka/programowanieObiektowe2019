public class IntStack {
    public StackNode tail;

    private class StackNode {
        private int value;
        private StackNode previous;

        private StackNode(int newValue, StackNode previous) {
            this.previous = previous;
            this.value = newValue;
        }

    }

    public void push(int newValue) {

        this.tail = new StackNode(newValue, tail);

    }

    public int pop() {
        if (tail == null) {
            throw new IllegalStateException("Empty IntStack");
        }
        int value = this.tail.value;
        this.tail = this.tail.previous;
        return value;
    }
}


