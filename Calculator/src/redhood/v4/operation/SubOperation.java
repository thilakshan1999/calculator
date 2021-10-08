package redhood.v4.operation;

public class SubOperation implements Operation {
    public double execute(double[] number)
    {
        return number[0]-number[1];
    }
}
