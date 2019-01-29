package stack;

import static org.junit.Assert.*;

public class MatchingBracketsTest {

    @org.junit.Test
    public void positiveTestCase1() {
        String string = "{{[()]}}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase2() {
        String string = "{{}}[]";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase3() {
        String string = "[]";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase4() {
        String string = "{}[]{()}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }


    @org.junit.Test
    public void positiveTestCase5() {
        String string = "{cS(125)}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase6() {
        String string = "{{{{{}[]{()}}}}}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase7() {
        String string = "";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void negativeTestCase1() {
        String string = "{}}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( 3, matcher.balanced(string));
    }

    @org.junit.Test
    public void negativeTestCase2() {
        String string = "}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(1, matcher.balanced(string));
    }

    @org.junit.Test
    public void negativeTestCase3() {
        String string = "foo({{}[]}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(10, matcher.balanced(string));
    }
}