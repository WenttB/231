package web.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.DAO.UserDaoImpl;
import web.models.User;

import java.util.List;
@Component
public class UserServiceImpl implements UserService, UserDao {
    private  UserDao userDao = new UserDaoImpl();
    @Transactional
    public List<User> allUsers() {
        return userDao.allUsers();

    }
    @Transactional
    public void saveUser (User user){
        userDao.saveUser(user);
    }
}
