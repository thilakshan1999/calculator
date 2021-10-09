package redhood.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide the operation as argument");
            return;
        }
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Plese provide add ,sub or mul as operational argument");
            return;
        }
        List<String> numberStr = Files.readAllLines(Paths.get("Number.txt"));
        double number1 = Double.valueOf(numberStr.get(0));
        double number2 = Double.valueOf(numberStr.get(1));


        double result = 0;
        if (operator.equals("add"))
            result = number1 + number2;
        else if (operator.equals("sub"))
            result = number1 - number2;
        else if (operator.equals("mul"))
            result = number1 * number2;

        System.out.println("the result is" + result);


    }
}
