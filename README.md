"# sumdigitsofsrtring"
instructions needs to be followed to run this standalone application.
1. To install all the Junit dependencies run below command
    example: mvn clean install
2. if you are using intellij navigate to VCS->checkoutfrom version control->github provide below URL.
    clone link: https://github.com/gsatyan/sumdigitsofsrtring.git
3. once you code gets downloaded navigate to the SumDigitsOfString.java file and right click and run it
4. it accepts with parameters as well please find the below examples.

Hexa:
   example 1: In intellij click on "edit configuration" at run button and navigate to program arguments "-x" this is case sensitive.
   Statement: the above statement similar to --> java -x
   input & result: enter input "abc123" on the console it gives result 39

InputFile:
   example 2: In intellij click on "edit configuration" at run button and navigate to program arguments "-f D:\file.temp" this is case sensitive.
   Statement: the above statement similar to --> java -f "D:\file.temp"
   input & result: it take input from your file and provide output console "result 39"
   Note: you have to create file and need to pass absolute path as 2nd argument

Default:
    example 3: In intellij click on "edit configuration" at run button.
    Statement: the above statement similar to --> java
    input & result: enter input "abc123" on the console it gives result 39

To run test cases mvn clean test which runs all test (for test cases no need to pass input files program reads from src\test\resources folder)
