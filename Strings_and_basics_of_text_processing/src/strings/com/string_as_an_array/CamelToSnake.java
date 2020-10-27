package strings.com.string_as_an_array;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class CamelToSnake {
    public static void main(String[] args) {
        String camelString = "It'sCamelCaseString";
        System.out.println(toSnakeCase(camelString));
    }

    private static String toSnakeCase(String string) {
        char[] symbols = string.toCharArray();
        String snakeStr = "";
        for (int i = 0; i < symbols.length; i++) {
            if(Character.isUpperCase(symbols[i]) && i == 0) {
                snakeStr = snakeStr + Character.toLowerCase(symbols[i]);
            } else if(Character.isUpperCase(symbols[i]) && i > 0) {
                snakeStr = snakeStr + "_";
                snakeStr = snakeStr + Character.toLowerCase(symbols[i]);
            } else {
                snakeStr = snakeStr + symbols[i];
            }
        }
        return snakeStr;
    }
}
