package strings.com.string_as_an_array;

//В строке найти количество цифр.

public class QuantityOfDig {
    public static void main(String[] args) {
        String digitString = "0Num4str1ng6";
        System.out.println(getQuantityOfDigits(digitString));
    }

    private static int getQuantityOfDigits(String digitString) {
        char[] symbols = digitString.toCharArray();
        int count = 0;
        for (Character c : symbols) {
            if(Character.isDigit(c))
                count++;
        }
        return count;
    }
}
