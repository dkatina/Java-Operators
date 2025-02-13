public class Casting {


    public static void main(String[] args) {
        //casting decimal into an int (conversion)
        int i1 = (int)5.5;
        System.out.println(i1);


        //we learning that when performing arithmetice on shorts they become ints
        //if we want to keep them as shorts we need to cast short over the expression
        short num1 = 3;
        short num4 = 5;
        short result = (short)(num1+num4);
        System.out.println(result);

        // Compound Arithmetic Operators
        long a = 5L;
        int b = 3;
        b += a;
        System.out.println(b); //b remains of type int

        int x = 10;
        // do the assignment first (x is now equal to 5)
        // then int y = x;
        int y = (x=5); //first sets x to 5 and then we assign the value of x to 5;
        System.out.println(x); // 5
        System.out.println(y); // ALSO 5
    }
}
