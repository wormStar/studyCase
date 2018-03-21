package com.ht.dao;

import com.ht.bean.User;
import com.ht.vo.charts.UserChartsData;

public interface UserDAO extends BaseDAO<String,User> {

    boolean getPhone(String phone);

    boolean getEmail(String email);

    User getByPhonePwd(String phone, String pwd);

    User getByEmailPwd(String email, String pwd);

    /**
     * 管理员获取用户统计数据
     * @return
     */
    UserChartsData getChartsData();
}
