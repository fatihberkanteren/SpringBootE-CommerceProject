package com.fatihberkant.ecommerce.dao;

import com.fatihberkant.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> { //Burdaki long product'ın id'sinin tipi

}
