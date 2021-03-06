package com.techcielo.sprhn.controller;

import com.techcielo.sprhn.bean.CategoryBean;
import com.techcielo.sprhn.repository.CategoryRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    CategoryRepo repo;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<CategoryBean> getAllCategories(){
        logger.info("Getting full category list");
        return (List<CategoryBean>) repo.findAll();
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CategoryBean> createCategory(@RequestBody CategoryBean bean){
        logger.info("Creating new Category");
        repo.save(bean);
        return (List<CategoryBean>) repo.findAll();
    }
}
