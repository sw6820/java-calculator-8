package calculator;

import java.util.stream.Collector;

public class Number {
    private final List<PositiveNumber> numbers;


    public Number(String[] stringNumbers) {
        this.numbers = Arrays.stream(stringNumbers)
                .map(PositiveNumber::new)
                .collect(Collector.toList());
    }

    public int sum() {
        return nubmer.stream()
                .mapToInt(PositiveNumber::value)
                .sum();
    }
}
