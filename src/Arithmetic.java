public class Arithmetic {



    public static void main(String[] args) {
//        //PEMDAS
//        int num = 2 + 6 * 3 - 5 *4;
//        System.out.println(num);
//
//        //numeric promotion
//        int intValue = 18;
//        long longValue = 20L;
//        //when adding two different data types the largest datatype wins
//        long result = intValue + longValue;
//        // result cant be an int
//        System.out.println(result);
//        //int + long = long
//        //byte + int = int
//        //etc
//
//        // when adding decimal to whole number result is a decimal
//        double myDouble = 5.5;
//        intValue = 2;
//        double resultDouble = myDouble + intValue;
//        // result cannot be set to an int
//        System.out.println(resultDouble);
//
//
//        //when adding small values (byte/short) together promotes to an int
//        byte byteValue = 10;
//        short shortValue = 20;
//        int intResult = byteValue + shortValue;
//        // result needs to be an int
//        System.out.println(intResult);


        //Unary Operators

        //ORDER MATTERS

        //++
        //--

        int count = 5;
        int result = ++count; //count is incremented to 6, then result set to the value of count
        System.out.println(count);
        System.out.println(result);

        int newCount = 5;
        int newResult = count++; // newResult set to value of count (5), then count is incremented to 6
        System.out.println(newCount);
        System.out.println(newResult);

    }
}
