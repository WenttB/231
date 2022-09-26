package web.DAO;
import web.models.User;

import java.util.List;

public interface UserDao {
    public List<User> allUsers ();
    public void saveUser (User user);
    public void update (long id, User upUser);
    public User show (long id);
    public void delete (long id);

}
