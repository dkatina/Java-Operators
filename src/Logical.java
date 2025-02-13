public class Logical {


    public static void main(String[] args) {
        boolean x = true && false;
        // `true && false` evaluates to `false` because both operands need to be `true` for `&&` to return `true`.
        // Result: false

        //IN VID
        int num1 = 5;
        int num2 = 12;
        boolean y = (num1 > num2) || (num2 > 2);
    // `num1 > num2` evaluates to `false` because 5 is not greater than 12.
    // `num2 > 2` evaluates to `true` because 12 is greater than 2.
    // `false || true` evaluates to `true` because `||` returns `true` if at least one operand is `true`.
    // Result: true

        int num3 = 10;
        int num4 = 100;
        boolean z = (num1 + num2 > num3) && (num4 <= 100) || true;
    // `num1 + num2 > num3` evaluates to `true` because 5 + 12 is 17, which is greater than 10.
    // `num4 <= 100` evaluates to `true` because 100 is equal to 100.
    // `true && true` evaluates to `true` because both operands are `true`.
    // `true || true` evaluates to `true` because `||` returns `true` if at least one operand is `true`.
    // Result: true

    // IN VID
        boolean a = true;
        boolean b = false;
        boolean c = !(a && b);
    // `a && b` evaluates to `false` because `true && false` results in `false`.
    // `!(false)` evaluates to `true` because `!` inverts the value of `false`.
    // Result: true

        boolean p = false;
        boolean q = (p = true);
    // The expression `(y = true)` assigns `true` to `y` and evaluates to `true` (the result of the assignment).
    // `x` is assigned the value of this expression, which is `true`.
    // Result: true
    }
}
