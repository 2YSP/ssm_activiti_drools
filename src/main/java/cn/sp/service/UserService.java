package cn.sp.service;

import cn.sp.bean.User;
import cn.sp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 2YSP on 2018/8/1.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user){
        userDao.insert(user);
    }
}

