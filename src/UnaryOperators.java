public class UnaryOperators {

    public static void main(String[] args) {
        int x = 4;
        int y = x++ + --x + x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        int a = 5;
        //          8  +  4   +  5 * 3 + 5
        int b = --a * 2 + a++ + a-- * 3 + ++a;
        System.out.println(b);

    }
}
