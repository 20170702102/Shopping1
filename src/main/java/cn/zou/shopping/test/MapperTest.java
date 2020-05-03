package cn.zou.shopping.test;

import cn.zou.shopping.bean.Fruit;
import cn.zou.shopping.bean.Order;
import cn.zou.shopping.bean.Role;
import cn.zou.shopping.bean.User;
import cn.zou.shopping.dao.FruitMapper;
import cn.zou.shopping.dao.OrderMapper;
import cn.zou.shopping.dao.RoleMapper;
import cn.zou.shopping.dao.UserMapper;
import cn.zou.shopping.service.FruitService;
import cn.zou.shopping.service.OrderService;
import cn.zou.shopping.service.TestService;
import cn.zou.shopping.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by 邹创基 on 2018/5/17 10:51
 * @Description: 测试dao层的工作
 * 推荐Spring的项目就可以使用Spring的单元测试类，可以自动注入需要我们需要的组件
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定配置文件的位置
 * 3.直接@Autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class MapperTest {

    @Autowired
    User user;

    @Autowired
    Role role;

    @Autowired
    Fruit fruit;

    @Autowired
    UserService userService;

    @Autowired
    FruitService fruitService;

    @Autowired
    OrderService orderService;

    @Autowired
    TestService testService;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD(){



       /*
       //UserMapper测试
       //测试根据名字查询权限
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.saveUser(new User("zou1000","123123","test"));
        List<String> roles = mapper.getRoles("zou0");
        System.out.println(roles);
        //得到所有普通用户
        List<User> allUser = mapper.getAllUserRoleUser();
        System.out.println(allUser);
        //根据名字得到用户
        User user = mapper.selectByUsername("zou1");
        System.out.println(user);
        */
       /*
       //测试水果mapper
       FruitMapper fruitMapper=sqlSession.getMapper(FruitMapper.class);
       Fruit fruit=fruitMapper.selectByPrimaryKey(1);
        System.out.println(fruit);*/

/*        //测试订单mapper
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order=new Order("1",1,"1","1",1,"1",(long)2,"1");
        orderMapper.insert(order);*/

      /*  //添加普通用户
        for(int i=0;i<20;i++){
            String nickname = UUID.randomUUID().toString().substring(0,5)+i;
            userService.saveUser(new User(i+i+"zou"+i+i,"123456",nickname,1));
            System.out.println("批量完成！！");
        }
        //添加水果
        for (int i=0;i<180;i++){
            String basename= UUID.randomUUID().toString().substring(0,5)+i;
            fruitService.saveFruit(new Fruit("作者"+i+"号", "img/"+((i%6)+1)+".jpg",basename+"水果",(i+10)%50,i+100,"中华出版社",(long)100,(long)0),i%10+1);
        }*/

      //测试事务
            User user = new User();
            user.setUsername("luoguohui1");
            user.setPassword("luoguohui1");
            user.setNickname("luoguohui1");
            testService.addUser(user);
    }
}
















