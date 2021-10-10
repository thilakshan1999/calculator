package redhood.v5;

import redhood.v5.input.Inputs;
import redhood.v5.input.InvalidInputExcetion;
import redhood.v5.operation.InvalidOperatioException;
import redhood.v5.operation.Operation;
import redhood.v5.operation.OperationFactory;
import redhood.v5.repository.NumberRepository;
import redhood.v5.repository.NumberRespoistoryException;
import redhood.v5.ui.UI;

public class CalculatorApp {
    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute()  {
        try {
            String operator = inputs.getOperator();
            double[] numbers = numberRepository.getNumber();
            Operation operation = operationFactory.getInstance(operator);
            double result = operation.execute(numbers);
            ui.showMessage("the result is" + result);
        }
        catch (NumberRespoistoryException | InvalidOperatioException | InvalidInputExcetion e) {
            ui.showMessage("Error Occured"+e.getMessage());
            return;
        }
    }
}
