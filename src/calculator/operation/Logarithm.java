package calculator.operation;

import java.util.List;

class Logarithm extends SequentialOperation {

    @Override
    public String getName() {
        return "log";
    }

    public double apply(List<Double> argumentsList) {
        if (argumentsList.size() != 2) {
            throw new IllegalArgumentException("Logarithm function must have only 2 arguments");
        }
        return accumulate(argumentsList.get(0), argumentsList.get(1));
    }

    @Override
    public double accumulate(double accumulator, double value) {
        double base = Math.log(accumulator);
        double exponent = Math.log(value);
        return exponent / base;
    }

}
