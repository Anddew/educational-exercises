package main.calculator.input;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ReaderFactory {

    public IReader getReader(String[] args) {
        String inputArgument = Arrays.stream(args).filter(x -> x.startsWith("-i=")).findFirst().orElse(null);
        if(inputArgument != null) {
            try {
                return new FileReader(inputArgument.substring(3));
            }  catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException. Can`t read file: " + inputArgument);
                return null;
            }
        } else {
            return new ConsoleReader();
        }
    }

}
