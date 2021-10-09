package redhood.v5.operation;

public class DivOperation implements Operation {
    public double execute(double[] number) throws InvalidOperatioException {
        if(number[1]==0)
        {
            throw new InvalidOperatioException("Do not dive by zero");
        }
        return number[0]/number[1];
    }
}
