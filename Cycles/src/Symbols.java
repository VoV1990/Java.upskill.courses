//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Symbols {
    public static void main(String[] args) {
        System.out.println("Выводим в консоль таблицу ASCII (начиная с 033):");
       printSymbols();
    }

    private static void printSymbols() {
        for(int i = 33; i <= 255; i ++) {
            char c = (char) i;
            System.out.println(i + " " + c);
        }
    }
}
