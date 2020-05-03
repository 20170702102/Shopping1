package cn.zou.shopping.controller;

import cn.zou.shopping.bean.*;
import cn.zou.shopping.service.FruitService;
import cn.zou.shopping.service.CategoryService;
import cn.zou.shopping.utils.CookieUtil;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * Created by 邹创基 on 2018/5/17 21:57
 *
 * @Description:
 */
@Controller
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    FruitService fruitService;

    @Autowired
    CategoryService categoryService;

    /**
     * 查询水果并做出分页处理，并跳转到首页
     * @param pageNo
     * @param model
     * @return
     */
    @RequestMapping(value = "/toindex")
    public String toindex(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo, Model model){
        PageHelper.startPage(pageNo,10);
        //startPage后面紧跟的就是一个分页查询
        List<Fruit> fruits= fruitService.getAllFruit();
        //使用PageInfo包装查询后的结果，只需将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询的数据.连续显示的页数
        PageInfo pageInfo=new PageInfo(fruits,5);
        model.addAttribute("fruits", fruits);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("url", "toindex");
        return "buy/FruitList";
    }

    @RequestMapping(value = "/Desc")
    public String Desc(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,Model model){
        PageHelper.startPage(pageNo,10);
        //startPage后面紧跟的就是一个分页查询
        List<Fruit> fruits= fruitService.getAllFruitByPriceDESC();
        //使用PageInfo包装查询后的结果，只需将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询的数据.连续显示的页数
        PageInfo pageInfo=new PageInfo(fruits,5);
        model.addAttribute("fruits", fruits);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("url", "Desc");
        return "buy/FruitList";
    }

    @RequestMapping(value = "/Asc")
    public String ASC(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,Model model) {
        PageHelper.startPage(pageNo,10);
        //startPage后面紧跟的就是一个分页查询
        List<Fruit> fruits= fruitService.getAllFruitByPriceASC();
        //使用PageInfo包装查询后的结果，只需将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询的数据.连续显示的页数
        PageInfo pageInfo=new PageInfo(fruits,5);
        model.addAttribute("fruits", fruits);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("url", "Asc");
        return "buy/FruitList";
    }

    /**
     * 获取水果的类别（parent_id为0，因为这里想以后能够扩展出现二级类别），返回Json格式数据
     * @param type
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/getParentTypeList")
    public String getParentTypeList(@RequestParam(value = "type", required = true) String type) throws Exception {
        List<Category> categoryList  = categoryService.getParentTypeList();
        return JSON.toJSONString(categoryList);
    }

    /**
     * 显示该类别所有水果
     * @param typeList
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/searchByCategory")
    public String searchByCategory(String typeList,Model model) throws Exception{
        List<Fruit> fruits=fruitService.getAllFruitByType(Integer.valueOf(typeList));
        model.addAttribute("fruits", fruits);
        return "buy/FruitListName";
    }

    /**
     * 通过水果名模糊查询水果
     * @param fruitName
     * @param model
     * @return
     */
    @RequestMapping(value = "/checkFruit")
    public String checkFruit(String fruitName,Model model){
        List<Fruit> fruits=fruitService.getAllFruitByName(fruitName);
        model.addAttribute("fruits", fruits);
        return "buy/FruitListName";
    }

    @RequestMapping(value = "/selectFruitBySale")
    public String selectFruitBySale(Model model) {
        List<Fruit> fruits = fruitService.selectFruitBySale();
        model.addAttribute("fruits", fruits);
        return "buy/SaleFruit";
    }
}
