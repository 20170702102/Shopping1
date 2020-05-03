package cn.zou.shopping.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Fruit {
    private Long bId;

    private String author;

    private String fruitImage;

    private String fruitName;

    private Integer price;

    private String brief;

    private String source;

    private Long stock;

    private Long sale;

    private Date uptime;

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getFruitImage() {
        return fruitImage;
    }

    public void setFruitImage(String fruitImage) {
        this.fruitImage = fruitImage == null ? null : fruitImage.trim();
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName == null ? null : fruitName.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrief() { return brief; }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getSale() {
        return sale;
    }

    public void setSale(Long sale) {
        this.sale = sale;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Fruit() {
    }

    public Fruit(String author, String fruitImage, String fruitName, Integer price, String brief, String source, Long stock, Long sale) {
        this.author = author;
        this.fruitImage = fruitImage;
        this.fruitName = fruitName;
        this.price = price;
        this.brief = brief;
        this.source = source;
        this.stock = stock;
        this.sale = sale;
    }

    public Fruit(Long bId, String author, String fruitImage, String fruitName, Integer price, String brief, String source, Long stock, Long sale) {
        this.bId = bId;
        this.author = author;
        this.fruitImage = fruitImage;
        this.fruitName = fruitName;
        this.price = price;
        this.brief = brief;
        this.source = source;
        this.stock = stock;
        this.sale = sale;
    }
}
