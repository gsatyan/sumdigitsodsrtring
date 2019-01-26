import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumDigitsOfString {

    private static Map<Character, Integer> mapSet;

    public static void main(String[] args) {
        int resultSum = 0;
        mapSet = new HashMap<>();
        mapSet.put('A', 10);
        mapSet.put('B', 11);
        mapSet.put('C', 12);
        mapSet.put('D', 13);
        mapSet.put('E', 14);
        mapSet.put('F', 15);

        boolean argsFlag;

        //Reading and validating arguments
        if (args.length > 1) {
            // must accept a file when flag[-f] is pass as arguments
            argsFlag = true;
            String str1;
            if (args[0].equalsIgnoreCase("-f")) {
                try {
                    BufferedReader br = Files.newBufferedReader(Paths.get(args[1]));
                    str1 = br.readLine();
                    if (str1 != null) {
                        char[] chars = str1.trim().toUpperCase().toCharArray();
                        getResultSum(resultSum, chars, argsFlag);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (args.length == 1) {
            // must handle hexa values when flag[-x] is pass as arguments followed by input
            argsFlag = true;
            String argString = args[0];
            if (argString != null && argString.equalsIgnoreCase("-x")) {
                getResultSum(resultSum, readInput(), argsFlag);
            }
        } else {
            // must accept STDIN as the default
            argsFlag = false;
            char[] noArgsInput = readInput();
            getResultSum(resultSum, noArgsInput, argsFlag);
        }
    }

    private static void getResultSum(int resultSum, char[] c1, boolean argsFlag) {
        if (argsFlag) {
            for (char c2 : c1) {
                if (Character.isLetter(c2)) {
                    resultSum += (mapSet.containsKey(c2)) ? mapSet.get(c2) : 0;
                } else if (Character.isDigit(c2)) {
                    resultSum += Integer.parseInt(String.valueOf(c2));
                }
            }
        } else {
            for (char c2 : c1) {
                if (Character.isDigit(c2)) {
                    resultSum += Integer.parseInt(String.valueOf(c2));
                }
            }
        }
        System.out.print("result: " + resultSum);
    }

    private static char[] readInput() {
        //Read input from console
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your input: ");

        String input = sc.nextLine();
        //  System.out.println("Given input: " + input);

        return input.trim().toUpperCase().toCharArray();
    }
}
