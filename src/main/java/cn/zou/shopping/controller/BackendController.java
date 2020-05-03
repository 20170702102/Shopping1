package cn.zou.shopping.controller;

import cn.zou.shopping.bean.Fruit;
import cn.zou.shopping.bean.Category;
import cn.zou.shopping.bean.Msg;
import cn.zou.shopping.bean.User;
import cn.zou.shopping.service.FruitService;
import cn.zou.shopping.service.CategoryService;
import cn.zou.shopping.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by 邹创基 on 2018/5/27 19:46
 *
 * @Description:后台页面相关接口
 */
@Controller
@RequestMapping("/backend")
public class BackendController {

    @Autowired
    UserService userService;

    @Autowired
    FruitService fruitService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/user/getAllUser", method = {RequestMethod.GET})
    public String getAllUser(@RequestParam(value = "pageNo", required = false, defaultValue = "0") Integer pageNo, Model model) {
        PageHelper.startPage(pageNo, 10);
        List<User> users = userService.getAllUserRoleUser();
        PageInfo pageInfo = new PageInfo(users, 5);
        model.addAttribute("users", users);
        model.addAttribute("pageInfo", pageInfo);
        return "manager/UserManagement";
    }

    @RequestMapping(value = "/user/getadmin", method = {RequestMethod.GET})
    public String getAllUser(Model model) {
        List<User> users = userService.getAllAdminRoleAdmin();
        model.addAttribute("users", users);
        return "manager/AdminManagement";
    }

    @RequestMapping(value = "/user/checkUser", method = {RequestMethod.POST})
    public String checkUser(@RequestParam(value = "username") String username, Model model) {
        PageHelper.startPage(0, 10);
        List<User> users = userService.selectBylikeUsername(username);
        PageInfo pageInfo = new PageInfo(users, 5);
        model.addAttribute("users", users);
        model.addAttribute("pageInfo", pageInfo);
        return "manager/UserManagement";
    }

    @RequestMapping(value = "/user/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/backend/user/getAllUser";
    }

    @RequestMapping(value = "/user/startUser/{id}")
    public String startUser(@PathVariable(value = "id") Integer id) {
        userService.startUser(id);
        return "redirect:/backend/user/getAllUser";
    }

    @RequestMapping(value = "/user/update/{id}")
    public String toUpdate(@PathVariable(value = "id") Long id, Model model) {
        User user = userService.selectByPrimary(id);
        model.addAttribute("user", user);
        return "manager/UpdateUser";
    }

    @RequestMapping(value = "/user/updateUser")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "redirect:/backend/fruit/getAllUser";
    }

    @RequestMapping(value = "/fruit/getAllFruit")
    public String toindex(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo, Model model) {
        PageHelper.startPage(pageNo, 10);
        //startPage后面紧跟的就是一个分页查询
        List<Fruit> fruits = fruitService.getAllFruit();
        //使用PageInfo包装查询后的结果，只需将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询的数据.连续显示的页数
        PageInfo pageInfo = new PageInfo(fruits, 5);
        model.addAttribute("fruits", fruits);
        model.addAttribute("pageInfo", pageInfo);
        return "manager/FruitManagement";
    }

    @RequestMapping(value = "/fruit/deleteFruit/{id}")
    public String deleteFruit(@PathVariable(value = "id") Long id) {
        fruitService.deleteFruit(id);
        return "redirect:/backend/fruit/getAllFruit";
    }

    @RequestMapping(value = "/fruit/update/{id}")
    public String update(@PathVariable(value = "id") Long id, Model model) {
        Fruit fruit = fruitService.getFruit(id);
        model.addAttribute("fruit", fruit);
        return "manager/UpdateFruit";
    }

    @RequestMapping(value = "/fruit/updateFruit")
    public String updateFruit(Fruit fruit) {
        fruitService.updateFruit(fruit);
        return "redirect:/backend/fruit/getAllFruit";
    }

    @RequestMapping(value = "/fruit/saveFruit")
    public String saveFruit(Fruit fruit,long cId) {
        fruitService.saveFruit(fruit, cId);
        return "redirect:/backend/fruit/getAllFruit";
    }

    @RequestMapping(value = "/fruit/toSaveFruit", method = RequestMethod.GET)
    public String saveFruit(Model model) {
        List<Category> typeList = categoryService.getParentTypeList();
        model.addAttribute("types", typeList);
        return "manager/addFruit";
    }
}
