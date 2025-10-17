package calculator;

import java.beans.Expression;

public class StringCalculator {
    public int sum(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        Expression expression = new Expression(text);

        String[] stringNumbers = expression.split();

        Number number = new Number(stringNumbers);

        return number.sum();

    }

}
