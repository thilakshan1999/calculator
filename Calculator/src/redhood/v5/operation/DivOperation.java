package redhood.v5.operation;

public class DivOperation implements Operation {
    public double execute(double[] number)
    {
        return number[0]/number[1];
    }
}
