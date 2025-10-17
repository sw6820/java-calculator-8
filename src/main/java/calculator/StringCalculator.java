package calculator;

public class StringCalculator {
    public int add(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        Expression expression = new Expression(text);

        String[] stringNumbers = expression.split();

        Numbers numbers = new Numbers(stringNumbers);

        return numbers.sum();

    }

}
