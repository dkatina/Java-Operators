public class Switch {

    public static void main(String[] args) {
        //switch statements are similar to if statements but instead of doing things based on True/False, the prefrom
        //actions based on the value passed in
        int grade = 80;
        switch (grade / 10){
            case 10: //because case 10  and 9 are not separated by break, the will produce the same code block
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("FAIL");
        }
    }
}
