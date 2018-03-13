package pl.websm.converter.fromCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.UserCommand;
import pl.websm.model.User;

@Component
public class UserCommandToUser implements Converter<UserCommand, User> {
    @Override
    public User convert(UserCommand userCommand) {
        return null;
    }
}
