package Lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args){
        String fileName = "expressions.txt", expression;
        int numberOne, result, numberTwo;

        try {
            String path = new File("src/lab4/" + fileName).getAbsolutePath();
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            expression = reader.readLine();
            while (expression != null) {

                numberOne = 0;
                numberTwo = 0;
                result = 0;
                Pattern pattern = Pattern.compile("(\\d+)(\\W{1})(\\d+)");
                Matcher matcher = pattern.matcher(expression);
                String sign;

                while (matcher.find()) {
                    numberOne = Integer.parseInt(matcher.group(1));
                    numberTwo = Integer.parseInt(matcher.group(3));
                    sign = matcher.group(2);
                    switch (sign) {
                        case "+":
                            result = numberOne + numberTwo;
                            break;
                        case "-":
                            result = numberOne - numberTwo;
                            break;
                        case "/":
                            if (numberTwo != 0) {
                                result = numberOne / numberTwo;
                                break;
                            } else{
                                System.out.println(numberOne + sign + numberTwo  + ": операция деления на 0 невозможна");
                                continue;
                            }
                        case "*":
                            result = numberOne * numberTwo;
                            break;
                    }
                    System.out.println(numberOne + sign + numberTwo + " = " + result);
                }

                expression = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
