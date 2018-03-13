package pl.websm.service;

import pl.websm.model.User;

public interface UserService {
    User createNewUser(String name, String password);
    User findById(Long id);
}
