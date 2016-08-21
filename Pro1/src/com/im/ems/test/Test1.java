/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.ems.test;

import com.im.ems.control.CategoryController;
import com.im.ems.model.Category;

/**
 *
 * @author Industrial Master
 */
public class Test1 {
    public static void main(String[] args) {
        
        //Test Case 01
        Category c = new Category();
        c.setId(1);
        c.setName("Food");
        CategoryController.create(c);
        
    }
}
