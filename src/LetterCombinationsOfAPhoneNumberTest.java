import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void testThatCanGetAccurateCombinationOf2And3(){
        String input = "23";
        List<String> expected = new ArrayList<>();
        expected.add("ad");
        expected.add("ae");
        expected.add("af");
        expected.add("bd");
        expected.add("be");
        expected.add("bf");
        expected.add("cd");
        expected.add("ce");
        expected.add("cf");
        List<String> actual = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
        assertEquals(expected,actual);
    }
}
