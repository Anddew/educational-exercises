package main.calculator.output;

public class ConsoleWriter implements IWriter {

    @Override
    public void write(String result)  {
        System.out.println(result);
    }

    @Override
    public void write(double result) {
        System.out.println(result);
    }

    @Override
    public void close() {
        //NOP
    }
}
