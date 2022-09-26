package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.DAO.UserDaoImpl;
import web.models.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> allUsers() {
        return userDao.allUsers();

    }
@Transactional
    public void saveUser (User user){
        userDao.saveUser(user);
    }
@Transactional
    public void update (long id, User upUser) {
        userDao.update(id,upUser);
    }
    public User show (long id) {
       return userDao.show(id);
    }
    @Transactional
    public void delete (long id) {
        userDao.delete(id);
    }
}
