package stack;

import static org.junit.Assert.*;

public class MatchingBracketsTest {

    @org.junit.Test
    public void positiveTestCase1() {
        String string = "{{[]}}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertTrue(matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase2() {
        String string = "{{}}[]";
        MatchingBrackets matcher = new MatchingBrackets();
        assertTrue(matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase3() {
        String string = "[]";
        MatchingBrackets matcher = new MatchingBrackets();
        assertTrue(matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase4() {
        String string = "{}[]{}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertTrue(matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase5() {
        String string = "";
        MatchingBrackets matcher = new MatchingBrackets();
        assertTrue(matcher.balanced(string));
    }

    @org.junit.Test
    public void negativeTestCase1() {
        String string = "{}}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertFalse(matcher.balanced(string));
    }
}