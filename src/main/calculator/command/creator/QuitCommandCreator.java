package main.calculator.command.creator;

import main.calculator.CalculatorContext;
import main.calculator.command.ICommand;
import main.calculator.command.InvalidInput;
import main.calculator.command.QuitCommand;

public class QuitCommandCreator implements ICommandCreator {

    @Override
    public ICommand createCommand(int prefixLength, String arguments, CalculatorContext calculatorContext) {
        if (arguments.isEmpty()) {
            return new QuitCommand(calculatorContext);
        } else {
            return new InvalidInput("Invalid input. Expression has wrong format: quit command must have no arguments.", calculatorContext);
        }
    }

}
