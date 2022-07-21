import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    public boolean checkUser(String user){
        boolean contemCaracteresEspeciais = user.contains("@") || user.contains("#");
        return user.length() >= 8 && !contemCaracteresEspeciais;
    }

    public boolean checkPassword(String password){
        boolean contemCaracteresEspeciais = password.contains("@") || password.contains("#") || password.contains("%") || password.contains("$");
        Pattern letters = Pattern.compile("[a-zA-Z]");
        Pattern digits = Pattern.compile("[0-9]");
        Matcher matchDigits = digits.matcher(password);
        Matcher matchLetters = letters.matcher(password);
        return password.length() >= 8 && contemCaracteresEspeciais && matchLetters.find() && matchDigits.find();
    }

}


