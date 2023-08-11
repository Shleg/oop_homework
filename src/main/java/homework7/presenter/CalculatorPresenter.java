package homework7.presenter;

import homework7.model.ComplexNumber;

public interface CalculatorPresenter {
    void onAddButtonClicked(ComplexNumber num1, ComplexNumber num2);
    void onMultiplyButtonClicked(ComplexNumber num1, ComplexNumber num2);
    void onDivideButtonClicked(ComplexNumber num1, ComplexNumber num2);

}
