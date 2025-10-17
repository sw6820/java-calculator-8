package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
    private final String text;
    private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.)\n(.*)");
    public Expression(String text) {
        this.text = text;
    }

    public String[] split() {
        Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(text);

        if (matcher.find()){
            return splitByCustomDelimiter(matcher);
        }
        return splitByDefaultDelimiter();
    }

    private String[] splitByCustomDelimiter(Matcher matcher) {
//        java.util.regex.Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(text);
//        matcher.find();
        String customDelimiter = matcher.group(1);
        String numberText = matcher.group(2);
        return numberText.split(Pattern.quote(customDelimiter));
    }

    private String[] splitByDefaultDelimiter() {
        return text.split("[,:]");
    }

}
