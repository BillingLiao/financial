package com.Billing.manager.repositories;

import com.Billing.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * 产品管理
 */
public interface ProductRepository extends CrudRepository<Product,String>, JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {
}
