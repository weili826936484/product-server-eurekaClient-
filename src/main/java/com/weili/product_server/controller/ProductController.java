package com.weili.product_server.controller;

import com.weili.product_server.model.Product;
import com.weili.product_server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Value("${server.port}")
    private String port;
    /**
     * 获取全部
     * @return
     */
    @RequestMapping(value = "/findAll/v1",method = RequestMethod.GET)
    public List<Product> findAll(){
        return productService.findAll();
    }

    @RequestMapping(value = "/findById/v1/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Integer id){
        /*try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Product product = productService.findById(id);
        product.setPort(port);
        return product;
    }
    @RequestMapping(value = "/saveProduct/v1",method = RequestMethod.POST)
    public Map<String,Object> saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @RequestMapping(value = "/saveProduct/v2",method = RequestMethod.POST)
    public Map<String,Object> saveProduct(@RequestParam("id")Integer id,@RequestParam("name") String name,@RequestParam("code") String code,@RequestParam("price") BigDecimal price ,@RequestParam("desc")String desc){
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setCode(code);
        product.setPrice(new BigDecimal(Integer.valueOf(price.toString())));
        product.setDesc(desc);
        return productService.saveProduct(product);
    }
}

