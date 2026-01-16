package com.firstExample.FirstClass.Service;

import com.firstExample.FirstClass.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {
    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101, "iphone",50000),
            new Product(102, "Canon Camera",40000)
    ));
    public List<Product> getProducts(){
        return products;
    }
    public Product getProductById(int prodId) {
        for (Product p : products) {
            if (p.getProdId() == prodId) {
                return p;
            }
        }
        throw new NoSuchElementException("Product with id " + prodId + " not found");
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
    public void updateProduct(Product prod){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                products.set(i, prod);
                return; // stop once updated
            }
        }
    }

    public void deleteProduct(int prodId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                products.remove(i);
                return; // stop once updated
            }
        }

    }
}
