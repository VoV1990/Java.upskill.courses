package strings.com.string_as_a_String_or_StringBuilder;

//В строке вставить после каждого символа 'a' символ 'b'.

public class ReplaceA {
    public static void main(String[] args) {
        String a_string = "a_stra_ceaSrt_a";
        System.out.println(toBString(a_string));
    }

    private static String toBString(String a_string) {
        String b_string;
        b_string = a_string.replaceAll("a", "ab");
        return b_string;
    }
}
