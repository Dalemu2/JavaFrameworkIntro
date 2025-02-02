package com.designpattern.JavaDesignPattern.designPattern.Adapter_Pattern;

//An adapter that allows MultiplyCalculator to be compatible with Base
public class CalculatorAdapter implements Base {

    MultiplyCalculator calculator;
    SumCalculator sumCalculator;

    public CalculatorAdapter(MultiplyCalculator newCalculator) {
        calculator = newCalculator;
    }

    int sum = 0;

    @Override
    public int addNum(int num) {
        calculator.sum = num;
        sum = num + calculator.multNum(1);
        return sum;
    }

    @Override
    public int subNum(int num) {
        calculator.sum = num;
        int min = calculator.multNum(-1);
        return sum + min;
    }
}
