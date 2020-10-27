package strings.com.string_as_an_array;

//Замените в строке все вхождения 'word' на 'letter'.

public class Letter {
    public static void main(String[] args) {
        String word = "word_to_word_new_word";
        System.out.println(toLetter(word));
    }

    private static String toLetter(String word) {
        return word.replaceAll("word", "letter");
    }
}
