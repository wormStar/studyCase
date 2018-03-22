package cn.stu.service.impl;

import cn.stu.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/21.
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserDAO userDAO;

}
