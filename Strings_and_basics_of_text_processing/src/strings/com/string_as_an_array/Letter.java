package strings.com.string_as_an_array;

//Замените в строке все вхождения 'word' на 'letter'.

import java.util.ArrayList;
import java.util.List;

public class Letter {
    public static void main(String[] args) {
        String string = "word_to_word_new_word";
        System.out.println(toLetter(string));
    }

    private static String toLetter(String string) {
        int countOfWord = getCountOfWord(string);
        char[]wordArray = string.toCharArray();
        int newArrayLength = getNewArrayLength(wordArray.length, countOfWord);
        char[]letterArray = new char[newArrayLength];
        char[]letter = "letter".toCharArray();
        int j = 0;
        for(int i = 0; i < wordArray.length; ) {
            if(isWord(i, wordArray)) {
                for (char c : letter) {
                    letterArray[j] = c;
                    j++;
                }
                i+= 4;
            } else {
                letterArray[j] = wordArray[i];
                i++;
                j++;
            }
        }
        return new String(letterArray);
    }

    private static int getCountOfWord(String string) {
        int indexWord;
        int countOfWord = 0;
        String tempWord = string;
        while (tempWord.contains("word")) {
            indexWord = tempWord.indexOf("word");
            tempWord = tempWord.substring(indexWord + 4);
            countOfWord++;
        }
        return countOfWord;
    }

    private static int getNewArrayLength(int oldArrayLength, int countOfWord) {
        int letterLength = "letter".length();
        int wordLength = "word".length();
        return oldArrayLength - (countOfWord * wordLength) + (countOfWord * letterLength);
    }

    private static boolean isWord(int count, char[] wordArray) {
        int wordLength = "word".length();
        for(int i = count; i <= wordArray.length - wordLength; i++) {
            return wordArray[i] == 'w' && wordArray[i + 1] == 'o' && wordArray[i + 2] == 'r'
                    && wordArray[i + 3] == 'd';
        }
        return false;
    }
}
