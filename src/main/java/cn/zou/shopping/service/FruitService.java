package cn.zou.shopping.service;

import cn.zou.shopping.bean.Fruit;
import cn.zou.shopping.bean.Msg;

import java.util.List;

/**
 * Created by 邹创基 on 2018/5/21 9:41
 *
 * @Description:
 */

public interface FruitService {

    //通过水果主键查找水果，返回Msg对象
    public Msg getFruitByPrimary(long id);
    //通过水果主键查找水果，返回Fruit对象
    public Fruit getFruit(long id);
    //按价格降序列出所有水果
    List<Fruit> getAllFruitByPriceDESC();
    //按价格升序列出所有水果
    List<Fruit> getAllFruitByPriceASC();
    //获取所有水果,返回List对象
    public List<Fruit> getAllFruit();
    //获取水果的类别,返回List对象
    public List<Fruit> getAllFruitByType(Integer typeId);
    //通过水果名字模糊查询水果,返回List对象
    public List<Fruit> getAllFruitByName(String fruitName);
    //删除该主键所对应的水果所有的信息
    public Msg deleteFruit(Long fruitId);
    //更新该水果信息
    public void updateFruit(Fruit fruit);
    //在水果类别表中保存该水果对应的信息
    public void saveFruit(Fruit fruit,long cId);
    //根据水果销量降序排序,列出五种
    public List<Fruit> selectFruitBySale();
}
