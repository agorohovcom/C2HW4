package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        int result;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return "Ошибка! На 0 делить нельзя";
        }
        return num1 + " / " + num2 + " = " + (result);
    }
}