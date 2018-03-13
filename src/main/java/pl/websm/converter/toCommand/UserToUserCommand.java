package pl.websm.converter.toCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.UserCommand;
import pl.websm.model.User;

@Component
public class UserToUserCommand implements Converter<User, UserCommand> {
    @Override
    public UserCommand convert(User user) {
        return null;
    }
}
