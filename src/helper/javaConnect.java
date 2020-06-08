package helper;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sumit Kumar
 */
public class javaConnect {
    
    public static Connection connectDb()
    {
        Connection conn = null;
        
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src//ATMManagement.sqlite");
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return conn;
    }
    
}
