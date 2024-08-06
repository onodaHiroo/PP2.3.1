package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.UserDao;
import web.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addNewUser(User user) {
        //userDao.addNewUser(user);
    }

    @Override
    public List<User> getListOfUsers() {
        return userDao.getListOfUsers();
    }

    @Override
    public void updateUser(User user) {
        //post kakoyta
    }

    @Override
    public void removeUserById(long id) {
        //post kakoyta
    }
}
