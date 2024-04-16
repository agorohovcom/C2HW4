package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
}
