package Questions;

public class ReverseInt {

    public static int reverse(int x) {
        String stringNum = String.valueOf(x);
        StringBuilder stringResult = new StringBuilder();
        for (int i = stringNum.length() - 1; i >= 0; i--) {
            char current = stringNum.charAt(i);
            if (stringNum.charAt(i) == '-') {
                stringResult.insert(0, '-'); //Append - to the beginning
            } else {
                stringResult.append(current);
            }
        }

        long reversed = Long.parseLong(stringResult.toString());
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        } else return Math.toIntExact(reversed);


/*        String temps = "" + x;
        char end = temps.charAt(2);
        char middle = temps.charAt(1);
        char beginning = temps.charAt(0);
        String reversed = "" + end + middle + beginning;
        int results = Integer.parseInt(reversed);*/

/*        int thousands = x % 1000;
        int hundreds = thousands % 100;
        int tens = hundreds % 10;
        System.out.println("thousands " + thousands);
        System.out.println("hundreds " + hundreds);
        System.out.println("tens " + tens);
        String temp = "" + tens + hundreds;
        int results = Integer.parseInt(temp);*/
    }

    public static void main(String[] args) {
        System.out.println(reverse(-125));
        //521
    }
}
