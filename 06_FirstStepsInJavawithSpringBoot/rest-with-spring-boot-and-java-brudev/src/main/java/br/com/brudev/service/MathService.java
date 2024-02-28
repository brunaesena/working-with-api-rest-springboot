package br.com.brudev.service;

import org.springframework.stereotype.Service;

@Service
public interface MathService {
    Double sum(String numberOne, String numberTwo);
    Double subtract(String numberOne, String numberTwo);
    Double multiply(String numberOne, String numberTwo);
    Double divide(String numberOne, String numberTwo);
    Double media(String numberOne, String numberTwo);
    Double squared(String number);
    Double squareRoot(String number);

}
