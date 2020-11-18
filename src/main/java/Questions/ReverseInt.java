package Questions;

public class ReverseInt {

    public int reverse(int x) {
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
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        } else return Math.toIntExact(reversed);
    }

    public int reverse2(int input) {
        int reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return reversed;
    }
}
