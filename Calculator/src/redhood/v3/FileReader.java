package redhood.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public double[] getNumber() throws IOException {
        List<String> numberStr = Files.readAllLines(Paths.get("Calculator/src/redhood/v3/Number.txt"));

        double number1 = Double.valueOf(numberStr.get(0));
        double number2 = Double.valueOf(numberStr.get(1));

        return new double[]{number1,number2};
    }
}
