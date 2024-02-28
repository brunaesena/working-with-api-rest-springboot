package br.com.brudev.service.implementations;

import br.com.brudev.exceptions.UnsupportedMathOperationException;
import br.com.brudev.helpers.MathHelpers;
import br.com.brudev.service.MathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceIMPL implements MathService {

    private MathHelpers mathHelpers;

    public MathServiceIMPL(MathHelpers mathHelpers) {
        this.mathHelpers = mathHelpers;
    }

    @Override
    public Double sum(String numberOne, String numberTwo) {
        if(!mathHelpers.isNumeric(numberOne) || !mathHelpers.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please, insert a numeric value!");
        }
        Double result = mathHelpers.convertToDouble(numberOne) + mathHelpers.convertToDouble(numberTwo);
        return result;
    }

    @Override
    public Double subtract(String numberOne, String numberTwo) {
        if(!mathHelpers.isNumeric(numberOne) || !mathHelpers.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please, insert a numeric value!");
        }
        Double result = mathHelpers.convertToDouble(numberOne) - mathHelpers.convertToDouble(numberTwo);
        return result;
    }

    @Override
    public Double multiply(String numberOne, String numberTwo) {
        if(!mathHelpers.isNumeric(numberOne) || !mathHelpers.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please, insert a numeric value!");
        }
        Double result = mathHelpers.convertToDouble(numberOne) * mathHelpers.convertToDouble(numberTwo);
        return result;
    }

    @Override
    public Double divide(String numberOne, String numberTwo) {
        if(!mathHelpers.isNumeric(numberOne) || !mathHelpers.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please, insert a numeric value!");
        }
        Double result = mathHelpers.convertToDouble(numberOne) / mathHelpers.convertToDouble(numberTwo);
        return result;
    }

    @Override
    public Double media(String numberOne, String numberTwo) {
        if(!mathHelpers.isNumeric(numberOne) || !mathHelpers.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please, insert a numeric value!");
        }
        Double result = (mathHelpers.convertToDouble(numberOne) + mathHelpers.convertToDouble(numberTwo))/2;
        return result;
    }

    @Override
    public Double squared(String number) {
        if(!mathHelpers.isNumeric(number)){
            throw new UnsupportedMathOperationException("Please, insert a numeric value!");
        }
        Double result = Math.pow(mathHelpers.convertToDouble(number),2);
        return result;
    }

    @Override
    public Double squareRoot(String number) {
        if(!mathHelpers.isNumeric(number)){
            throw new UnsupportedMathOperationException("Please, insert a numeric value!");
        }
        Double result = Math.sqrt(mathHelpers.convertToDouble(number));
        return result;
    }
}
