package com.swaggerexample.service;

import com.swaggerexample.entity.MyProduct;
import com.swaggerexample.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService{
    @Autowired private MyRepository repository;
    @Override
    public List<MyProduct> showProduct() {
        return repository.findAll();
    }

    @Override
    public void addProduct(MyProduct product) {
         repository.save(product);

    }

    @Override
    public void updateProduct(MyProduct product, long productId) {

        MyProduct oldProduct=repository.findById(productId).get();

        oldProduct.setProductPrice(product.getProductPrice());
        oldProduct.setProductName(product.getProductName());
        oldProduct.setProductDescription(product.getProductDescription());

        repository.save(oldProduct);
    }


    @Override
    public void deleteProduct(long productId) {
        repository.deleteById(productId);
    }
}
