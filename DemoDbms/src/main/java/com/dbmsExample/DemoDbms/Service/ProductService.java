package com.dbmsExample.DemoDbms.Service;

import com.dbmsExample.DemoDbms.Model.product;
import com.dbmsExample.DemoDbms.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<product> products = new ArrayList<>(
//            Arrays.asList(
//                    new product(101,"phone",70000),
//                    new product(102, "tv",40000),
//                    new product(103, "game",50000)
//            ));
    public List<product> getProducts(){
        return repo.findAll();
    }
    public product getProductById(int prodId){
        return repo.findById(prodId).orElse(new product());
    }
    public void addProduct(product prod){
        repo.save(prod);
    }
    public void updateProduct(product prod){
        repo.save(prod);
    }
    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}
