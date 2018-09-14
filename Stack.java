public class Stack {
    private int[] array;
    private int level = 0;

    public Stack(int size) {
        this.array = new int[size];
    }

    public void push(int x) {
        if (!this.isFull()) {
            this.array[level] = x;
            this.level++;
        }
    }

    public void pop() {
        if (this.level > 0) {
            this.array[this.level - 1] = 0;
            this.level--;
        }
    }

    public boolean isFull(){
        return this.level == this.array.length;
    }
}
