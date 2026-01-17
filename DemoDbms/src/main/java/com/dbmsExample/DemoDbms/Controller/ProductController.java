package com.dbmsExample.DemoDbms.Controller;

import com.dbmsExample.DemoDbms.Model.product;
import com.dbmsExample.DemoDbms.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService prod;
    @RequestMapping("/products")
    public List<product> getProduct(){
        return prod.getProducts();
    }
    @RequestMapping("/product/{prodId}")
    public product getProductById(@PathVariable int prodId){
        return prod.getProductById(prodId);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody product prod1){
        prod.addProduct(prod1);
    }
    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId ){
        prod.deleteProduct(prodId);
    }
    @PutMapping("/productedit")
    public void editProduct(@RequestBody product prod1){
        prod.updateProduct(prod1);
    }
}
