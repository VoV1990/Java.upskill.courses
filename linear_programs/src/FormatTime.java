import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormatTime {
    static {
        System.out.println("Please enter quantity of seconds: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long seconds = Long.parseLong(reader.readLine());
        System.out.println(getTime(seconds));
    }

    private static String getTime (long seconds) {
        int min = ((int) seconds / 60);
        int sec = (int) seconds % 2;
        int hours = min / 60;
        min = min % 2;
        return String.format("%02d ч %02d мин %02d с", hours, min, sec);
    }
}
