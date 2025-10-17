package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    private final List<PositiveNumber> numbers;


    public Numbers(String[] stringNumbers) {
        this.numbers = Arrays.stream(stringNumbers)
                .map(PositiveNumber::new)
                .collect(Collectors.toList());
    }

    public int sum() {
        return numbers.stream()
                .mapToInt(PositiveNumber::value)
                .sum();
    }
}
