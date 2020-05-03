package cn.zou.shopping.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class Detail implements Serializable{
    private Long odId;

    private String fruitName;

    private Integer fruitPrice;

    private Integer fruitNum;

    private String oId;

    private Date uptime;

    public Long getOdId() {
        return odId;
    }

    public void setOdId(Long odId) {
        this.odId = odId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName == null ? null : fruitName.trim();
    }

    public Integer getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(Integer fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public Integer getFruitNum() {
        return fruitNum;
    }

    public void setFruitNum(Integer fruitNum) {
        this.fruitNum = fruitNum;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Detail() {
    }

    public Detail(String fruitName, Integer fruitPrice, Integer fruitNum) {
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.fruitNum = fruitNum;
    }

    public Detail(Long odId, String fruitName, Integer fruitPrice, Integer fruitNum, String oId, Date uptime) {
        this.odId = odId;
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.fruitNum = fruitNum;
        this.oId = oId;
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "odId=" + odId +
                ", fruitName='" + fruitName + '\'' +
                ", fruitPrice=" + fruitPrice +
                ", fruitNum=" + fruitNum +
                ", oId='" + oId + '\'' +
                ", uptime=" + uptime +
                '}';
    }
}