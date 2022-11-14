package cn.mystore.session;

import java.io.Serializable;

// 实现Serializable接口，使得Product类对象可以序列化
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    public Product() {
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
