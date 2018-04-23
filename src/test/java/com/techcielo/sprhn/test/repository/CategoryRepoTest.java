package com.techcielo.sprhn.test.repository;

import com.techcielo.sprhn.bean.CategoryBean;
import com.techcielo.sprhn.repository.CategoryRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryRepoTest {

    @Before
    public void init(){
        repo.save(new CategoryBean(1,"Sports"));
        repo.save(new CategoryBean(2,"Technology"));
    }
    @Autowired
    CategoryRepo repo;

    @Test
    public void shouldRetrunAllCategories(){
        List<CategoryBean> catList = repo.findAll();
        Assert.assertNotNull(catList);
        Assert.assertEquals(2,catList.size());
    }

    @Test
    public void shouldRetrunCorrectCategory(){
        CategoryBean expectedResult = new CategoryBean(1,"Sports");
        CategoryBean actualResult = repo.findById(1).get();
        Assert.assertNotNull(actualResult);
        Assert.assertTrue(actualResult.getName().equals(expectedResult.getName()) && actualResult.getId()==expectedResult.getId());
    }
}
