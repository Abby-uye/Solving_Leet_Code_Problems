import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

        public static List<String> generateParenthesis ( int number){
            List<String> generatedParenthesis = new ArrayList<>();
            generateParenthesisHelper(number, number, "", generatedParenthesis);
            return generatedParenthesis;
        }

        private static void generateParenthesisHelper ( int left, int right, String current, List< String > result){
            if (left == 0 && right == 0) {
                result.add(current);
                return;
            }

            if (left > 0) {
                generateParenthesisHelper(left - 1, right, current + "(", result);
            }

            if (right > left) {
                generateParenthesisHelper(left, right - 1, current + ")", result);
            }
        }


        public static void main(String[] args) {
            int n = 8;
            List<String> combinations = generateParenthesis(n);

            for (String combination : combinations) {
                System.out.println(combination);
            }
        }
    }


