package strings.com.string_as_a_String_or_StringBuilder;

//С помощью функции копирования
//и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Cake {
    public static void main(String[] args) {
        String informatics = "информатика";
        System.out.println(toCake(informatics));
    }

    private static String toCake(String str) {
        return String.valueOf(str.charAt(7)) + str.charAt(3) + str.charAt(4) + str.charAt(7);
    }
}
