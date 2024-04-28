import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> convertDigits = new ArrayList<>();
        String[] digitStrings = {
                "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        for (int index = 0; index < digits.length(); index++) {
            int value = Character.getNumericValue(digits.charAt(index));
            if (value >= 2 && value <= 9) {
                convertDigits.add(digitStrings[value - 2]);
            }
        }

        List<String> combinations = new ArrayList<>();
        generateCombinations(convertDigits, 0, new StringBuilder(), combinations);

        return combinations;
    }

    private static void generateCombinations(List<String> digitStrings, int index, StringBuilder current, List<String> combinations) {
        if (index == digitStrings.size()) {
            combinations.add(current.toString());
            return;
        }

        String digitString = digitStrings.get(index);
        for (int i = 0; i < digitString.length(); i++) {
            current.append(digitString.charAt(i));
            generateCombinations(digitStrings, index + 1, current, combinations);
            current.deleteCharAt(current.length() - 1);
        }
    }

}
//        if(digits.isEmpty()){
//            return new ArrayList<>();
//        }
//
//        List<String> convertDigits = new ArrayList<>();
//        String two = "abc";
//        String three = "def";
//        String four = "ghi";
//        String five = "jkl";
//        String six = "mno";
//        String seven = "pqrs";
//        String eight = "tuv";
//        String nine = "wxyz";
//        for (int index = 0; index < digits.length(); index++) {
//            int value = Integer.parseInt(String.valueOf(digits.charAt(index)));
//            switch (value) {
//                case 2 -> convertDigits.add(two);
//                case 3 -> convertDigits.add(three);
//                case 4 -> convertDigits.add(four);
//                case 5 -> convertDigits.add(five);
//                case 6 -> convertDigits.add(six);
//                case 7 -> convertDigits.add(seven);
//                case 8 -> convertDigits.add(eight);
//                case 9 -> convertDigits.add(nine);
//            }
//        }
//        return getStrings(convertDigits);
//    }
//
//
//
//    private static List<String> getStrings(List<String> convertDigits) {
//        List<String> returnList = new ArrayList<>();
//        String convertString = convertDigits.getFirst();
//        if (convertDigits.size()==1){
//            for (int index = 0; index <convertString.length(); index++) {
//                returnList.add(String.valueOf(convertString.charAt(index)));
//
//            }
//        }
//
//        for (int index = 0; index < convertString.length(); index++) {
//            String emptyString = "";
//
//            for (int index1 = 1; index1 < convertDigits.size(); index1++) {
//                for (int index2 = 0; index2 < convertDigits.get(index1).length(); index2++) {
//                    emptyString=String.valueOf(convertString.charAt(index));
//                    emptyString+=convertDigits.get(index1).charAt(index2);
//                    System.out.println(emptyString);
//                    returnList.add(emptyString);
//                }
//
//
//            }
//
//        }
//
//        return returnList;
//    }






