package cn.zou.shopping.service.Impl;

import cn.zou.shopping.bean.Fruit;
import cn.zou.shopping.bean.Msg;
import cn.zou.shopping.dao.FruitMapper;
import cn.zou.shopping.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.security.Key;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 邹创基 on 2018/5/17 19:59
 *
 * @Description:
 */
@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitMapper fruitMapper;

    @Override
    public Msg getFruitByPrimary(long bid) {
        Fruit fruit = fruitMapper.selectByPrimaryKey(bid);
        return Msg.success().add("fruit", fruit);
    }

    @Override
    public Fruit getFruit(long id) {
        Fruit fruit = fruitMapper.selectByPrimaryKey(id);
        return fruit;

    }

    @Override
    public List<Fruit> getAllFruitByPriceDESC() {
        return fruitMapper.getAllFruitByPriceDESC();
    }

    @Override
    public List<Fruit> getAllFruitByPriceASC() {
        return fruitMapper.getAllFruitByPriceASC();
    }

    @Override
    public List<Fruit> getAllFruit() {
        return fruitMapper.getAllFruit();
    }

    @Override
    public List<Fruit> getAllFruitByType(Integer typeId) {
        return fruitMapper.getAllFruitByType(typeId);
    }

    @Override
    public List<Fruit> getAllFruitByName(String fruitName) {
        return fruitMapper.getAllFruitByName(fruitName);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Msg deleteFruit(Long fruitId) {
        fruitMapper.deleteFruit_Category(fruitId);
        fruitMapper.deleteFruitByPrimary(fruitId);
        return Msg.success();
    }

    @Override
    public void updateFruit(Fruit fruit) {
        fruitMapper.updateFruit(fruit);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveFruit(Fruit fruit, long cId) {
        fruitMapper.saveFruit(fruit);
        HashMap<String, Long> map = new HashMap<>();
        map.put("bId", fruit.getbId());
        map.put("cId", cId);
        fruitMapper.saveFruitCategory(map);
    }

    @Override
    public List<Fruit> selectFruitBySale() {
        return fruitMapper.selectFruitBySale();
    }
}
