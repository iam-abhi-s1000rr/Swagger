package com.swaggerexample.controller;

import com.swaggerexample.entity.MyProduct;
import com.swaggerexample.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {

    @Autowired
    private MyService service;


    @GetMapping("/showproduct")
    public List<MyProduct> showProduct(){
        return service.showProduct();
    }

    @PostMapping("/addproduct")
    public String addProduct(@RequestBody MyProduct product){
         service.addProduct(product);
        return "product Added Successfully";
    }

    @PutMapping("/updateproduct/{id}")
    public String updateProduct(@RequestBody MyProduct product,@RequestParam("{id}") long productId) {
        service.updateProduct(product,productId);
        return "Data Updated for "+productId;
    }
    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@RequestParam("{id}") long productId) {
        service.deleteProduct(productId);
        return "product deleted";
    }

}
