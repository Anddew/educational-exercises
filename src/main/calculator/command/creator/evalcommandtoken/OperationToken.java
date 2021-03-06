package main.calculator.command.creator.evalcommandtoken;

import main.calculator.operation.IOperation;

public class OperationToken implements IEvalCommandToken {

    private IOperation operation;

    public OperationToken(IOperation operation) {
        this.operation = operation;
    }

    public IOperation getOperation() {
        return operation;
    }

    @Override
    public EvalCommandTokenType getTokenType() {
        return EvalCommandTokenType.OPERATION;
    }
}
