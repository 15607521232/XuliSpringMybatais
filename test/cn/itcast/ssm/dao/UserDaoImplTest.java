package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;


    @Before
    public void setUp() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception{
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        User user = userDao.fingUserById(1);
        System.out.println(user);
    }
}
