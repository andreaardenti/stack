public class Stack {
    private int[] array;
    private int level = 0;

    public Stack(int size) {
        this.array = new int[size];
        for(int i=0; i < this.array.length-1; i++) {
            this.array[i] = (int) (Math.random() * 100);
        }
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

    public void shift(int newValue) {
        for(int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = newValue;
    }

    public void unshift(int newValue) {
        for(int i=0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = newValue;
    }

    public int getMin(){
        int min = this.array[0];
        for (int i=1; i < this.array.length; i++) {
            if (min > this.array[i]) {
                min = this.array[i];
            }
        }
        return min;
    }

    public int getMax(){
        int max = this.array[0];
        for (int i=1; i < this.array.length; i++) {
            if (max < this.array[i]) {
                max = this.array[i];
            }
        }
        return max;
    }

}
