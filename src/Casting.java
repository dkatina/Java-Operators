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
    }
}
