package homework7.presenter;

import homework7.model.ComplexNumber;
import homework7.view.CalculatorView;

import homework7.logger.Logger;

public class ConcreteCalculatorPresenter implements CalculatorPresenter {
    private CalculatorView view;
    private Logger logger;

    public ConcreteCalculatorPresenter(CalculatorView view, Logger logger) {
        this.view = view;
        this.logger = logger;
    }

    @Override
    public void onAddButtonClicked(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.add(num2);
        view.showResult(result);
        logger.log("Сложение выполнено\n: " + num1 + " + " + num2 + " = " + result);
    }

    @Override
    public void onMultiplyButtonClicked(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.multiply(num2);
        view.showResult(result);
        logger.log("Умножение выполнено\n: " + num1 + " * " + num2 + " = " + result);
    }

    @Override
    public void onDivideButtonClicked(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.divide(num2);
        view.showResult(result);
        logger.log("Деление выполнено\n: " + num1 + " / " + num2 + " = " + result);
    }
}



