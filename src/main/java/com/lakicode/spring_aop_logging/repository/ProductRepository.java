package com.lakicode.spring_aop_logging.repository;

import com.lakicode.spring_aop_logging.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
