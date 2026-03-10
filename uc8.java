import java.util.HashMap;
import java.util.Map;

public class uc8 {

    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        renderBanner("OOPS");
    }

    static void renderBanner(String word) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c)[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}