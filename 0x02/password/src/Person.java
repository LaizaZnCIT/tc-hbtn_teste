import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    public boolean checkUser(String user){
        boolean contemCaracteresEspeciais = user.contains("@") || user.contains("#");
        return user.length() >= 8 && !contemCaracteresEspeciais;
    }

    public boolean checkPassword(String password){
        boolean contemCaracteresEspeciais = password.contains("@") || password.contains("#") || password.contains("%") || password.contains("$");
        Pattern p = Pattern.compile("[a-zA-Z0-9]");
        Matcher m = p.matcher(password);
        return password.length() >= 8 && contemCaracteresEspeciais && m.find();
    }

}


