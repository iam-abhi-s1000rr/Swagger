package com.swaggerexample.repository;

import com.swaggerexample.entity.MyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<MyProduct,Long> {
}
