import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;


public class SumDigitsOfStringTest {

    @Test
    public void positivePassWithNoArgument1() {
        //Scenario: Given zero args and input "abc123"
        String[] args = new String[0];

        //Input and output
        ByteArrayInputStream in = new ByteArrayInputStream("abc123".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //storing command line input and output
        System.setIn(in);
        System.setOut(new PrintStream(out));

        //Running main App
        SumDigitsOfString.main(args);

        //Assert with expected vs actual
        Assert.assertEquals("result: 6", out.toString());
    }

    @Test
    public void shouldPassWithNoArgument2() {
        //Scenario: Given zero args and input "qq"
        String[] args = new String[0];

        //Input and output
        ByteArrayInputStream in = new ByteArrayInputStream("qq".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //storing command line input and output
        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumDigitsOfString.main(args);

        //Assert with expected vs actual
        Assert.assertEquals("result: 0", out.toString());
    }

    @Test
    public void shouldPassWithOneArgument() {
        //Scenario: positive case, Given one argument for Hexa decimal  and input "abc123"
        String[] args = {"-x"};

        //Input and output
        ByteArrayInputStream in = new ByteArrayInputStream("abc123".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //storing command line input and output
        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumDigitsOfString.main(args);

        //Assert with expected vs actual
        Assert.assertEquals("result: 39", out.toString());
    }

    @Test
    public void shouldPassWithOneArgument1() {
        //Scenario: negative case, Given one argument for Hexa decimal  and input "qq"
        String[] args = {"-x"};

        //Input and output
        ByteArrayInputStream in = new ByteArrayInputStream("qq".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //storing command line input and output
        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumDigitsOfString.main(args);

        //Assert with expected vs actual
        Assert.assertEquals("result: 0", out.toString());
    }

    @Test
    public void shouldPassWithTwoArgument() {

        //Scenario: Given two argument and input "ab"
        String[] args = {"-f", getFileForTestCases("file.temp")};

        //Input and output
        //ByteArrayInputStream in = new ByteArrayInputStream("ab".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //storing command line input and output
        // System.setIn(in);
        System.setOut(new PrintStream(out));

        SumDigitsOfString.main(args);

        //Assert with expected vs actual
        Assert.assertEquals("result: 39", out.toString());

    }

    @Test
    public void shouldPassWithTwoArgument1() {
        //Scenario: Given two argument and input "ab"

        String[] args = {"-f", getFileForTestCases("file2.temp")};

        //Input and output
        //ByteArrayInputStream in = new ByteArrayInputStream("ab".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //storing command line input and output
        // System.setIn(in);
        System.setOut(new PrintStream(out));

        SumDigitsOfString.main(args);

        //Assert with expected vs actual
        Assert.assertEquals("result: 0", out.toString());
    }

    private String getFileForTestCases(String fileName){
        File resourcesDirectory = new File("src/test/resources/"+fileName);
        return resourcesDirectory.getAbsolutePath();
    }
}