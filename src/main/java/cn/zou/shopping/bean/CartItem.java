package cn.zou.shopping.bean;

/**
 * Created by 邹创基 on 2018/5/23 13:13
 *
 * @Description:购物车类
 */

public class CartItem {
    private long id;
    private long b_id;
    private String author;
    private String fruit_image;
    private String fruit_name;
    private int price;
    private String source;
    private int quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getB_id() {
        return b_id;
    }

    public void setB_id(long b_id) {
        this.b_id = b_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFruit_image() {
        return fruit_image;
    }

    public void setFruit_image(String fruit_image) {
        this.fruit_image = fruit_image;
    }

    public String getFruit_name() {
        return fruit_name;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CartItem() {
    }

    public CartItem(String author, String fruit_image, String fruit_name, int price, String source, int quantity) {
        this.author = author;
        this.fruit_image = fruit_image;
        this.fruit_name = fruit_name;
        this.price = price;
        this.source = source;
        this.quantity = quantity;
    }

    public CartItem(long id, String author, String fruit_image, String fruit_name, int price, String source, int quantity) {
        this.id = id;
        this.author = author;
        this.fruit_image = fruit_image;
        this.fruit_name = fruit_name;
        this.price = price;
        this.source = source;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", fruit_image='" + fruit_image + '\'' +
                ", fruit_name='" + fruit_name + '\'' +
                ", price=" + price +
                ", source='" + source + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
