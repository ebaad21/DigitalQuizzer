package com.quizer.service;

import com.quizer.dao.UserDao;
import com.quizer.model.User;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    UserDao userDao;
    
    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public void saveOrUpdate(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public User findUser(User user) {
        return userDao.findUser(user);
    }
    
}
