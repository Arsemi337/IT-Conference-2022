package milosz.artur.it.conference.user.ex;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String login) {
        super("Użytkownik z loginem " + login + " nie został znaleziony");
    }

    public UserNotFoundException(String login, String email) {
        super("Użytkownik z loginem " + login + " i emailem " + email + " nie został znaleziony");
    }
}
