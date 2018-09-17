public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Stack s = new Stack(10);
        /*s.push(14);
        s.push(34);
        s.push(17);
        s.pop();
        s.push(32);
        s.push(11);
        s.push(9);

        s.shift(12);

        s.unshift(40);*/
        //int y = s.getMin();
        int z = s.getMax();

        int y = s.replaceMin(100);

    }
}
