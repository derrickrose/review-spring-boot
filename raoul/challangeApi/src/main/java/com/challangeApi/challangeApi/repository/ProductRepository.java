package com.challangeApi.challangeApi.repository;

import com.challangeApi.challangeApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
