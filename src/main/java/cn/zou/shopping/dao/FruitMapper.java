package cn.zou.shopping.dao;

import cn.zou.shopping.bean.Fruit;
import cn.zou.shopping.bean.FruitExample;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.crypto.hash.Hash;

import java.util.HashMap;
import java.util.List;

public interface FruitMapper {

    //通过水果主键查找水果
    Fruit selectByPrimaryKey(long bId);
    //获取所有水果
    List<Fruit> getAllFruit();
    //按价格降序列出所有水果
    List<Fruit> getAllFruitByPriceDESC();
    //按价格升序列出所有水果
    List<Fruit> getAllFruitByPriceASC();
    //查找该类别下所有水果
    List<Fruit> getAllFruitByType(Integer typeId);
    //通过水果名字模糊查询水果
    List<Fruit> getAllFruitByName(String fruitName);
    //删除水果类别表中b_id为该水果主键的行
    void deleteFruit_Category(Long fruitId);
    //删除水果表中主键为该水果主键的行
    void deleteFruitByPrimary(Long fruitId);
    //更新该水果信息
    void updateFruit(Fruit fruit);
    //在水果表中保存该水果信息
    int saveFruit(Fruit fruit);
    //在水果类别表中保存该水果对应的信息
    int saveFruitCategory(HashMap<String, Long> map);
    //更新对应的水果的库存和销量
    int reduceFruit(HashMap<String, Long> map);
    //查询对应数据的库存
    long checkFruitStock(long bId);
    //根据水果销量降序排序,列出五种
    List<Fruit> selectFruitBySale();
}