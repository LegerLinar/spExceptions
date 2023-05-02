import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class Password {
    public static void passwordCreate(String login, String password, String confirmPassword) {
        if (!(login.length() < 20) || !Pattern.matches("(([a-zA-Z0-9_]*))", login) || login.isBlank()) {
            throw new WrongLoginException("Неверный формат логина");
        }
        if (!(password.length() < 20) || !Pattern.matches("(([a-zA-Z0-9_]*))", password) || password.isBlank()) {
            throw new WrongPasswordException("Неверный формат пароля");
        }
        if (!password.contentEquals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
