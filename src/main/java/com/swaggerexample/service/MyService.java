package com.swaggerexample.service;

import com.swaggerexample.entity.MyProduct;

import java.util.List;

public interface MyService {
    List<MyProduct> showProduct();

    void addProduct(MyProduct product);

    void updateProduct(MyProduct product,long productId);

    void deleteProduct(long productId);
}
