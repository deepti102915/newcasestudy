package com.github.perscholas;

import com.github.perscholas.model.*;
import org.junit.Assert;
import org.junit.Test;

public class TestConstructor {
    @Test
    public void userConstructorTest() {
        User user = new User();
        Assert.assertTrue(user instanceof UserRepo);
    }

    @Test
    public void dealConstructorTest() {
        Deal deal = new Deal();
        Assert.assertTrue(deal instanceof DealRepo);
        //Assert.assertNotNull(deal.getStudentCourses());
    }

    @Test
    public void itemConstructorTest() {
        Item item = new Item();
        Assert.assertTrue(item instanceof ItemRepo);
        //Assert.assertNotNull(deal.getStudentCourses());
    }

    @Test
    public void productConstructorTest() {
        Product product = new Product();
        Assert.assertTrue(product instanceof ProductRepo);
        //Assert.assertNotNull(deal.getStudentCourses());
    }
}
