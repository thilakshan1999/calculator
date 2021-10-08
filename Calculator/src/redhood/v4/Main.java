package redhood.v4;

import redhood.v4.operation.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CommandLineInput input=new CommandLineInput(args);
        String operator=input.getOperator();

        FileReader fileReader=new FileReader();
        double []numbers= fileReader.getNumber();

        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance(operator);

        double result= operation.execute(numbers);

        UI ui=new UI();
        ui.showMessage("the result is" + result);


    }
}
