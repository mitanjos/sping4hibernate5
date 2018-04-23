package com.techcielo.sprhn.repository;

import com.techcielo.sprhn.bean.CategoryBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryBean,Integer> {
}
