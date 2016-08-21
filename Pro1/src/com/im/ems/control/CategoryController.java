/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.ems.control;

import com.im.ems.model.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Industrial Master
 */
public class CategoryController {
    
    public static boolean create(Category category){
        try {
            String sql = "INSERT INTO category (name) VALUES ('"+category.getName()+"')";
            String url = "jdbc:mysql://localhost:3306/dbems";
            String un = "root";
            String pw = "0147";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, un, pw);
            
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public static Category retrieve(int id){
        Category category = new Category();
        try {
            String sql = "SELECT * FROM category WHERE id='"+id+"'";
            String url = "jdbc:mysql://localhost:3306/dbems";
            String un = "root";
            String pw = "0147";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, un, pw);
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                String name = rs.getString("name");
                category.setName(name);
                category.setId(id);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }
    
    
}
