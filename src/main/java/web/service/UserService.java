package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    public List<User> allUsers();
    public void saveUser (User user);
    public void update (User upUser);

}
