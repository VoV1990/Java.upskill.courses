package strings.com.string_as_an_array;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class CamelToSnake {
    public static void main(String[] args) {
        String camelString = "It'sCamelCaseString";
        System.out.println(toSnakeCase(camelString));
    }

    private static String toSnakeCase(String string) {
        StringBuilder snakeStr = new StringBuilder();
        char[] symbols = string.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if(Character.isUpperCase(symbols[i]) && i == 0) {
                snakeStr.append(Character.toLowerCase(symbols[i]));
            } else if(Character.isUpperCase(symbols[i]) && i > 0) {
                snakeStr.append("_").append(Character.toLowerCase(symbols[i]));
            } else {
                snakeStr.append(symbols[i]);
            }
        }
        return snakeStr.toString();
    }
}
