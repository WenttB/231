package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.DAO.UserDaoImpl;
import web.models.User;

import java.util.List;
@Component
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
@Autowired
    private  UserDao userDao = new UserDaoImpl();

    public List<User> allUsers() {
        return userDao.allUsers();

    }
    @Transactional
    public void saveUser (User user){
        userDao.saveUser(user);
    }
    @Transactional
    public void update (User upUser) {
        userDao.update(upUser);
    }
}
