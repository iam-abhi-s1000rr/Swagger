package com.swaggerexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class MyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long productId;
    private String productName;
    private String productDescription;
    private long productPrice;

}
