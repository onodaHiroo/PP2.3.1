package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addNewUser(User user);

    List<User> getListOfUsers();

    void updateUser(User user);

    void removeUserById(long id);
}
