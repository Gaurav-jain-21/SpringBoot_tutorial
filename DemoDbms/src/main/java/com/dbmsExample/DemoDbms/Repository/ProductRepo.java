package com.dbmsExample.DemoDbms.Repository;

import com.dbmsExample.DemoDbms.Model.product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepo extends JpaRepository<product, Integer>{

}
