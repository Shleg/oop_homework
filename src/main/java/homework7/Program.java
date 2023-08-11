package homework7;

import homework7.logger.ConsoleLogger;
import homework7.logger.Logger;
import homework7.model.ComplexNumber;
import homework7.presenter.ConcreteCalculatorPresenter;
import homework7.view.CalculatorActivity;
import homework7.view.CalculatorView;

public class Program {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorActivity();
        Logger logger = new ConsoleLogger();
        ConcreteCalculatorPresenter presenter = new ConcreteCalculatorPresenter(view, logger);

        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, 5);
        presenter.onAddButtonClicked(num1, num2);
        presenter.onMultiplyButtonClicked(num1, num2);
        presenter.onDivideButtonClicked(num1, num2);

    }
}
