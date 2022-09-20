package web.DAO;
import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;
    public void saveUser (User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> allUsers() {
        TypedQuery<User> query = entityManager.createQuery("select u from User u",User.class);
        return query.getResultList();

    }
    public void update (User upUser) {

    }
}
