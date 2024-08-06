package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addNewUser(User user);

    List<User> getListOfUsers();

    void updateUser(User user);

    void removeUserById(long id);
}
