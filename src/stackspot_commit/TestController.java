package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestController {

    public void unsafeMethod(String input) {
        try {
            // High Severity: SQL Injection vulnerability for testing
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "user", "pass");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE name = '" + input + "'";
            stmt.executeQuery(query);
            
            // Clean Code violation: generic exception handling
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
