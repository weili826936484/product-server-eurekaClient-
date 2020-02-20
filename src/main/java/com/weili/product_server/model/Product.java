package com.weili.product_server.model;

import java.math.BigDecimal;

public class Product {
    private Integer id;
    private String name;
    private String code;
    private BigDecimal price;
    private String desc;
    private String port;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Product() {
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Product(Integer id, String name, String code, BigDecimal price, String desc) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
        this.desc = desc;
    }


}
