package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

public interface UserDao {
    public User fingUserById(int id) throws Exception;
}
