import java.util.regex.*;
    
public class ExtractDigits {
    public static void main(String[] args) {
        String text = "abc123456";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}