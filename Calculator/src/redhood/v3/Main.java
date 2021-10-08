package redhood.v3;

import redhood.v3.operation.AddOperation;
import redhood.v3.operation.MulOperation;
import redhood.v3.operation.SubOperation;

public class Main {
    public static void main(String[] args) throws Exception {

        CommandLineInput input=new CommandLineInput(args);
        String operator=input.getOperator();

        FileReader fileReader=new FileReader();
        double []numbers= fileReader.getNumber();

        double result = 0;
        if (operator.equals("add")) {
            AddOperation addOperation = new AddOperation();
            result= addOperation.execute(numbers);
        }
        else if (operator.equals("sub")) {
            SubOperation subOperation= new SubOperation();
            result=subOperation.execute(numbers);
        }
        else if (operator.equals("mul")) {
            MulOperation mulOperation=new MulOperation();
            result= mulOperation.execute(numbers);
        }
        System.out.println("the result is" + result);

    }
}
