public class IfStatements {

    public static void main(String[] args) {
        //very similar to JS if statements
        //NEEDS CURLY BRACES
        int z = 10;
        if(z > 5) {
            System.out.println("z is greater than 5");
        } else {
            System.out.println("z is less than or equal to 5");
        }

        if(z >= 5) {
            System.out.println("z is greater than or equal to 5");
        } else if(z > 2) {
            System.out.println("z is greater than 2 but less than 5");
        }

        //Ternary operators
        int a = 10;
        int b = 12;
        String x = (b >= a) ? "b is greater than or equal to a"  : "b is less than a"; // b is greater than or equal to a so x = "b is greater than or equal to a"
        System.out.println(x);
    }
}
