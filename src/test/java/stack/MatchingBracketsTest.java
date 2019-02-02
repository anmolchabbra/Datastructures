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
    public void positiveTestCase8() {
        String string = "[()]";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase9() {
        String string = "(())";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase10() {
        String string = "[()]";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase11() {
        String string = "{[]}()";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals( -1, matcher.balanced(string));
    }

    @org.junit.Test
    public void positiveTestCase12() {
        String string = "{}[]";
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
        assertEquals(4, matcher.balanced(string));
    }
    @org.junit.Test
    public void negativeTestCase4() {
        String string = "foo{}{";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(6, matcher.balanced(string));
    }
    @org.junit.Test
    public void negativeTestCase5() {
        String string = "foo{{{}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(5, matcher.balanced(string));
    }
    @org.junit.Test
    public void negativeTestCase6() {
        String string = "{[2+3]*[5*(6*5)]";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(1 , matcher.balanced(string));
    }
    @org.junit.Test
    public void negativeTestCase7() {
        String string = "foo(bar[i)";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(10 , matcher.balanced(string));
    }

    @org.junit.Test
    public void negativeTestCase8() {
        String string = "{[}";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(3 , matcher.balanced(string));
    }

    @org.junit.Test
    public void negativeTestCase9() {
        String string = "{";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(1 , matcher.balanced(string));
    }

    @org.junit.Test
    public void negativeTestCase10() {
        String string = "{hey((({[]})";
        MatchingBrackets matcher = new MatchingBrackets();
        assertEquals(6, matcher.balanced(string));
    }
}