package calculator.operation;

import calculator.input.stringparsingtool.Bounds;

import java.util.List;
import java.util.Optional;

public interface IOperation {

    String getName();

    Bounds getOperandsBounds();

    OperationResult apply(List<Double> argumentsList);

    default Optional<String> checkArguments(List<Double> argumentsList) {
        return Optional.empty();
    }

}