package calculator.operation;

import calculator.input.stringparsingtool.Bounds;

import java.util.List;
import java.util.Optional;

class PowerOf implements IOperation {

    private Bounds bounds = new Bounds(2, 2);

    @Override
    public String getName() {
        return "pow";
    }

    @Override
    public Bounds getOperandsBounds() {
        return bounds;
    }

    @Override
    public OperationResult apply(List<Double> argumentsList) {
        return new OperationResult(
                Math.pow(argumentsList.get(0), argumentsList.get(1))
        );
    }

    @Override
    public Optional<String> checkArguments(List<Double> argumentsList) {
        return Optional.empty();
    }

}
