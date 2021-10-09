package redhood.v5.operation;

public class AddOperation implements Operation {
    public double execute(double[] number)
    {
        return number[0]+number[1];
    }
}
