package zest;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static List<String> generateParentheses(int n) {
        List<String> combinations = new ArrayList();
        if (n<=0) return combinations;
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    private static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current)) result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    private static boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }
}
