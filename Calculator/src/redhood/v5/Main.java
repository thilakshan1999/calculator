package redhood.v5;

import redhood.v5.input.CommandLineInput;
import redhood.v5.input.Inputs;
import redhood.v5.operation.OperationFactory;
import redhood.v5.repository.FileNumberRepository;
import redhood.v5.repository.NumberRepository;
import redhood.v5.ui.CmdLineUI;
import redhood.v5.ui.UI;

public class Main {
    public static void main(String[] args) throws Exception {

        Inputs inputs=new CommandLineInput(args);
        NumberRepository numberRepository=new FileNumberRepository();
        OperationFactory operationFactory=new OperationFactory();
        UI ui=new CmdLineUI();

        CalculatorApp app=new CalculatorApp(inputs,numberRepository,operationFactory,ui);
        app.execute();



    }
}
