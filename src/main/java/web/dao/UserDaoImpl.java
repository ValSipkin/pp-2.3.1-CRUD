//package web.dao;
//
//
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import web.model.User;
//
//import javax.persistence.Query;
//import java.util.List;
//
//@Repository
//public class UserDaoImpl implements UserDao
//{
//
//    private SessionFactory sessionFactory;
//    @Autowired
//    public UserDaoImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public List<User> getUserList() {
//        Session session = sessionFactory.getCurrentSession();
//        List<User> list = session.createQuery("from User", User.class).getResultList();
//        return list;
//    }
//
//    @Override
//    public User getUser(int id) {
//        return sessionFactory.getCurrentSession().get(User.class, id);
//    }
//
//    @Override
//    public void saveUser(User user) {
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
//    }
//
//    @Override
//    public void deleteUser(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query query = session.createQuery("delete from User u where u.id = :id");
//        query.setParameter("id", id);
//        query.executeUpdate();
//    }
//}
