package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1=new Product();
        product1.setProductCategory("instrument");
        product1.setProductCondition("new");
        product1.setProductDescription("This is a fender start guitar !!");
        product1.setProductName("Guitar1");
        product1.setProductPrice(1200);
        product1.setProductStatus("Active");
        product1.setUnitInStack(11);
        product1.setProductManufacture("Fender");

        Product product2=new Product();
        product2.setProductCategory("instrument");
        product2.setProductCondition("new");
        product2.setProductDescription("This is a gooood keyboard !!");
        product2.setProductName("Keyboard");
        product2.setProductPrice(2200);
        product2.setProductStatus("Active");
        product2.setUnitInStack(20);
        product2.setProductManufacture("Fender");

        Product product3=new Product();
        product3.setProductCategory("instrument");
        product3.setProductCondition("new");
        product3.setProductDescription("This is violin  !!");
        product3.setProductName("violin");
        product3.setProductPrice(1000);
        product3.setProductStatus("Active");
        product3.setUnitInStack(5);
        product3.setProductManufacture("Fender");

            productList=new ArrayList<Product>();
            productList.add(product1);
            productList.add(product2);
            productList.add(product3);
            return productList;
    }

}
