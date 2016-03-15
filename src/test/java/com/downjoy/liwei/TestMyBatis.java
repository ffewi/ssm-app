package com.downjoy.liwei;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.downjoy.liwei.domain.User;
import com.downjoy.liwei.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class); 
    @Resource  
    private IUserService userService = null;
    
    @Test  
    public void test1() {  
        
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");  
        //userService = (IUserService) ac.getBean("userService");
        User user = userService.getUserById(1);  
        System.out.println(user.getUserName());  
        logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
    }  
    
    @Test
    public void testUpdate(){
         
         User user = new User();
         user.setAge(23);
         user.setId(45);
         user.setPassword("qqqqqqqq");
         user.setUserName("22222222");
         User user1 = userService.getUserById(user.getId());
         System.out.println("---------------------------------------");
         logger.info(JSON.toJSONString(user1)); 
         userService.updateUserById(user);
         user1 = userService.getUserById(user.getId());
         System.out.println("---------------------------------------");
         logger.info(JSON.toJSONString(user1)); 
         
         
         
    }
}
