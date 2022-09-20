package web.DAO;
import web.models.User;

import java.util.List;

public interface UserDao {
    public List<User> allUsers ();
    public void saveUser (User user);
    public void update (User upUser);

}
