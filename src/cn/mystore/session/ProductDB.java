package cn.mystore.session;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class ProductDB {
    private static Map<String, Product> products = new LinkedHashMap<String, Product>();
    static {
        products.put("1", new Product("1", "javaweb开发"));
        products.put("2", new Product("2", "jdbc开发"));
        products.put("3", new Product("3", "java基础"));
        products.put("4", new Product("4", "struts开发"));
        products.put("5", new Product("5", "spring开发"));
    }
    // 获得所有的商品
    public static Collection<Product> getAll() {
        return products.values();
    }
    // 根据指定的id获得商品
    public static Product getProduct(String id) {
        return products.get(id);
    }
}
