package calculator;

public class PositiveNumber {
    private final int number;

    public PositiveNumber(String stringNumber) {
        int parsedNumber = parseToInt(stringNumber);
        validatePositive(parsedNumber);
        this.number = parsedNumber;
    }

    public int value() {
        return number;
    }

    private int parseToInt(String stringNumber) {
        try {
            return Integer.parseInt(stringNumber.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }

    private void validatePositive(int parsedNumber) {
        if(parsedNumber < 0) {
            throw new IllegalArgumentException("음수가 포함될 수 없습니다.");
        }
    }

}
