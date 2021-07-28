package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User fingUserById(int id) throws Exception {
        //继承SqlSessionDaoSupport，通过this.getSqlSession()得到sqlSessoin
        SqlSession session = this.getSqlSession();
        User user = session.selectOne("test.findUserById",id);
        return user;

    }
}
