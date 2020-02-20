package com.weili.product_server.service.impl;

import com.weili.product_server.model.Product;
import com.weili.product_server.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static List<Product> list;

    private final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    static {
        Product product = new Product();
        product.setId(1);
        product.setName("iphoneX");
        product.setCode("0001");
        product.setPrice(new BigDecimal(6000));
        product.setDesc("神经网络cpu");
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("iphone11");
        product2.setCode("0002");
        product2.setPrice(new BigDecimal(10000));
        product2.setDesc("神经网络cpu A12");
        list = new ArrayList<Product>();
        list.add(product);
        list.add(product2);
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Product findById(Integer id) {
        logger.info("findById");
        return list.get(id-1);
    }

    @Override
    public Map<String, Object> saveProduct(Product product) {
        list.add(product);
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        return map;
    }
}
