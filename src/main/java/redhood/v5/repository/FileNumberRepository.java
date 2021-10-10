package redhood.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

    public double[] getNumber() throws NumberRespoistoryException {
        List<String> numberStr = null;
        try {
            numberStr = Files.readAllLines(Paths.get("Number.txt"));
        } catch (IOException e) {
            throw new NumberRespoistoryException(e,"Coudn't read the file");
        }

        double number1 = Double.valueOf(numberStr.get(0));
        double number2 = Double.valueOf(numberStr.get(1));

        return new double[]{number1,number2};
    }
}
